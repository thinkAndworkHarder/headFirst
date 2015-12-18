package cn.jeb.models.strategy;

import cn.jeb.models.strategy.bean.Person;
import cn.jeb.models.strategy.service.UseWeaponBehavior;
import cn.jeb.models.strategy.service.impl.AxeBehavior;
import cn.jeb.models.strategy.service.impl.KnifeBehavior;

public class Demo {

	public static void main(String[] args) {
		Person person = new Person();
		UseWeaponBehavior behavior = new KnifeBehavior();
		person.setBehavior(behavior);
		person.useWeapon();
		behavior = new AxeBehavior();
		person.setBehavior(behavior);
		person.useWeapon();
	}
}
