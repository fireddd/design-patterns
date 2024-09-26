package command;

public class LightSwitchCommand implements ICommand {

    Light light;

    public LightSwitchCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOnLight();
    }

    @Override
    public void unexecute() {
        light.switchOffLight();
    }
}
