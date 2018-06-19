package patterns.factorymethod.virusexample.factory;

import patterns.factorymethod.virusexample.product.InfluenzaVirus;
import patterns.factorymethod.virusexample.product.RhinoVirus;
import patterns.factorymethod.virusexample.product.Virus;

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
