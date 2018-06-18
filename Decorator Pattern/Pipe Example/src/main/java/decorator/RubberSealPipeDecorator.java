package decorator;

import component.Pipe;

public class RubberSealPipeDecorator extends PipeDecorator {


    public RubberSealPipeDecorator(Pipe pipe) {
        super(pipe);
    }

    public Integer getMaxPressure() {
        return pipe.getMaxPressure() + 30;
    }
}
