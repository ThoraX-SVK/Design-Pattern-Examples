package test;

import factory.CommonVirusFactory;
import factory.DeadlyVirusFactory;
import factory.VirusFactory;
import org.junit.Test;
import product.Virus;

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
