package cn.jeb.models.command;

import cn.jeb.models.command.client.RemoteController;
import cn.jeb.models.command.concreteBean.FanOffCommand;
import cn.jeb.models.command.concreteBean.FanOnCommand;
import cn.jeb.models.command.concreteBean.LightOffCommand;
import cn.jeb.models.command.concreteBean.LightOnCommand;
import cn.jeb.models.command.reciever.Fan;
import cn.jeb.models.command.reciever.Light;

public class CommandMain {

	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		Fan fan = new Fan();
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		remoteController.setCommand(0, fanOnCommand, fanOffCommand);
		remoteController.setCommand(1, lightOnCommand, lightOffCommand);
		
		System.out.println(remoteController);
		remoteController.onButtonPressed(0);
	}
}
