package cn.jeb.models.strategy.service.impl;

import cn.jeb.models.strategy.service.UseWeaponBehavior;

public class KnifeBehavior implements UseWeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("using Knife...");
	}

}
