package factory;

import product.InfluenzaVirus;
import product.RhinoVirus;
import product.Virus;

public class CommonVirusFactory implements VirusFactory {

    public Virus getVirus() {

        Double rand = Math.random();

        if(rand > 0.5) {
            return new RhinoVirus();
        } else {
            return new InfluenzaVirus();
        }
    }
}
