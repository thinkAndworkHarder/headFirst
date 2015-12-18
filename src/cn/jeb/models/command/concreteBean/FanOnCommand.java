package cn.jeb.models.command.concreteBean;

import cn.jeb.models.command.abstractBean.Command;
import cn.jeb.models.command.reciever.Fan;

public class FanOnCommand implements Command {

	private Fan fan;
	
	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public FanOnCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.fanOn();
	}

	@Override
	public void undo() {
		fan.fanOff();
	}

}
