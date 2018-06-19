package patterns.decorator.pipeexample.decorator;

import patterns.decorator.pipeexample.component.Pipe;

public class NanotubesReinforcementDecorator extends PipeDecorator {

    public NanotubesReinforcementDecorator(Pipe pipe) {
        super(pipe);
    }

    public Integer getMaxPressure() {
        return pipe.getMaxPressure() + 70;
    }
}
