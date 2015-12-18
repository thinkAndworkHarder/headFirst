package cn.jeb.models.command.concreteBean;

import cn.jeb.models.command.abstractBean.Command;
import cn.jeb.models.command.reciever.Fan;

public class FanOffCommand implements Command {

	private Fan fan;
	
	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("fan on");
	}

	@Override
	public void undo() {
		System.out.println("fan off");
	}

}
