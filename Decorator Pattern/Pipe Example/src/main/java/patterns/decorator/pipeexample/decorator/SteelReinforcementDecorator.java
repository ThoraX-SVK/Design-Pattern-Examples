package patterns.decorator.pipeexample.decorator;

import patterns.decorator.pipeexample.component.Pipe;

public class SteelReinforcementDecorator extends PipeDecorator {

    public SteelReinforcementDecorator(Pipe pipe) {
        super(pipe);
    }

    public Integer getMaxPressure() {
        return pipe.getMaxPressure() + 45;
    }
}
