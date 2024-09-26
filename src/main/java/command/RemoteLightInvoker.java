package command;

public class RemoteLightInvoker {
    ICommand lightSwitchCommand;

    public RemoteLightInvoker(ICommand lightSwitchCommand) {
        this.lightSwitchCommand = lightSwitchCommand;
    }

    public void clickOnButton(){
        this.lightSwitchCommand.execute();
    }

    public void clickOffButton(){
        this.lightSwitchCommand.unexecute();
    }

}
