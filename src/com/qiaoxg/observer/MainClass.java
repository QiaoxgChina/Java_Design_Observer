package com.qiaoxg.observer;

import com.qiaoxg.observer.observer.OneObserver;
import com.qiaoxg.observer.observer.ThreeObserver;
import com.qiaoxg.observer.observer.TowObserver;
import com.qiaoxg.observer.subject.Subject;

public class MainClass {
	public static void main(String[] agrs) {
		Subject sub = new Subject();

		OneObserver one = new OneObserver(sub);
		TowObserver tow = new TowObserver(sub);
		ThreeObserver three = new ThreeObserver(sub);

		System.out.println("the state will change to 1234");
		sub.setState(1234);
		
		System.out.println(" \nthe state will change to 654");
		sub.setState(654);

	}
}
