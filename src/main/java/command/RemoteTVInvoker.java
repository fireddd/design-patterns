package command;

public class RemoteTVInvoker{

    ICommand muteCommand;

    public RemoteTVInvoker(ICommand iCommand) {
        this.muteCommand = iCommand;
    }

    public void mute() {
        muteCommand.execute();
    }

    public void unmute() {
        muteCommand.unexecute();
    }

}
