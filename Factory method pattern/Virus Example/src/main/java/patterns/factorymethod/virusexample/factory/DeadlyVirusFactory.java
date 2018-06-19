package patterns.factorymethod.virusexample.factory;

import patterns.factorymethod.virusexample.product.EbolaVirus;
import patterns.factorymethod.virusexample.product.Virus;
import patterns.factorymethod.virusexample.product.ZikaVirus;

public class DeadlyVirusFactory implements VirusFactory {

    public Virus getVirus() {

        Double rand = Math.random();

        if(rand > 0.5) {
            return new ZikaVirus();
        } else {
            return new EbolaVirus();
        }
    }
}
