package factory;

import product.EbolaVirus;
import product.Virus;
import product.ZikaVirus;

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
