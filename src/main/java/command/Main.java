package command;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        Light light = new Light();
        ICommand lightSwitchCommand = new LightSwitchCommand(light);
        RemoteLightInvoker remoteInvoker = new RemoteLightInvoker(lightSwitchCommand);
        remoteInvoker.clickOnButton();
        remoteInvoker.clickOffButton();
        TV tv = new TV();
        ICommand muteCommand = new MuteCommand(tv);
        RemoteTVInvoker remoteTVInvoker = new RemoteTVInvoker(muteCommand);
        remoteTVInvoker.mute();
        remoteTVInvoker.unmute();
        GrandRemote grandRemote = new GrandRemote(lightSwitchCommand, muteCommand);
        grandRemote.switchOnLight();
        grandRemote.switchOffLight();
        grandRemote.muteTv();
        grandRemote.unMuteTV();
    }
}
