package cn.jeb.models.command.client;

import cn.jeb.models.command.abstractBean.Command;
import cn.jeb.models.command.concreteBean.NoCommand;

public class RemoteController {

	private Command[] onCommands;
	
	private Command[] offCommands;

	public RemoteController() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPressed(int slot) {
		offCommands[slot].execute();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < offCommands.length; i++) {
			sb.append("slot")
			.append("[")
			.append(i)
			.append("]:")
			.append(onCommands[i].getClass().getSimpleName())
			.append("		")
			.append(offCommands[i].getClass().getSimpleName())
			.append(" \n");
		}
		return sb.toString();
	}
}
