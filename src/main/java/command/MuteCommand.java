package command;

public class MuteCommand implements ICommand {

    TV tv;

    public MuteCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mute();
    }

    @Override
    public void unexecute() {
        tv.unmute();
    }
}
