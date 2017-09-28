package com.qiaoxg.observer.observer;

import com.qiaoxg.observer.subject.Subject;

public class ThreeObserver extends Observer {

	private Subject subject;

	public ThreeObserver(Subject s) {
		this.subject = s;
		this.subject.attach(this);
	}

	public void updateState(int state) {
		System.out.println("ThreeObserver state changed!! " + state);
	}

}
