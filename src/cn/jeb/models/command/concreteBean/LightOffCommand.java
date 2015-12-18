package cn.jeb.models.command.concreteBean;

import cn.jeb.models.command.abstractBean.Command;
import cn.jeb.models.command.reciever.Light;

public class LightOffCommand implements Command {

	private Light light;
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff();
	}

	@Override
	public void undo() {
		light.lightOn();
	}

}
