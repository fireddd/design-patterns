package command;

public class GrandRemote {

    ICommand onCommand;
    ICommand muteCommand;

    public GrandRemote(ICommand onCommand, ICommand muteCommand) {
        this.onCommand = onCommand;
        this.muteCommand = muteCommand;
    }

    public void switchOnLight() {
        onCommand.execute();
    }

    public void switchOffLight() {
        onCommand.unexecute();
    }

    public void muteTv() {
        muteCommand.execute();
    }

    public void unMuteTV() {
        muteCommand.unexecute();
    }
}
