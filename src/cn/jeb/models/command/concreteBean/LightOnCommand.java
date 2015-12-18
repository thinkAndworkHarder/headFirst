package cn.jeb.models.command.concreteBean;

import cn.jeb.models.command.abstractBean.Command;
import cn.jeb.models.command.reciever.Light;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOn();
	}

	@Override
	public void undo() {
		light.lightOff();
	}

}
