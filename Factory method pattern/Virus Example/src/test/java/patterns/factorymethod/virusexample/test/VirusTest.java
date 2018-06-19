package patterns.factorymethod.virusexample.test;

import patterns.factorymethod.virusexample.factory.CommonVirusFactory;
import patterns.factorymethod.virusexample.factory.DeadlyVirusFactory;
import patterns.factorymethod.virusexample.factory.VirusFactory;
import org.junit.Test;
import patterns.factorymethod.virusexample.product.Virus;

public class VirusTest {

    @Test
    public void testDeadlyViruses() {

        VirusFactory deadlyVirusFactory = new DeadlyVirusFactory();

        for (int i = 0; i < 4; i++) {
            Virus deadlyVirus = deadlyVirusFactory.getVirus();
            System.out.println("Oh no, you got " + deadlyVirus.getName());
        }
    }

    @Test
    public void testCommonViruses() {

        VirusFactory commonVirusFactory = new CommonVirusFactory();

        for (int i = 0; i < 4; i++) {
            Virus commonVirus = commonVirusFactory.getVirus();
            System.out.println("Oh no, you got " + commonVirus.getName());
        }
    }



}
