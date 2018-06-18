package decorator;

import component.Pipe;

public abstract class PipeDecorator implements Pipe {

    protected Pipe pipe;

    public PipeDecorator(Pipe pipe) {
        this.pipe = pipe;
    }
}
