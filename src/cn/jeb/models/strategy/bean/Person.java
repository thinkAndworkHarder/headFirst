package cn.jeb.models.strategy.bean;

import cn.jeb.models.strategy.service.UseWeaponBehavior;

public class Person {

	UseWeaponBehavior behavior;
	
	public void setBehavior(UseWeaponBehavior behavior) {
		this.behavior = behavior;
	}

	public void useWeapon() {
		behavior.useWeapon();
	}
}
