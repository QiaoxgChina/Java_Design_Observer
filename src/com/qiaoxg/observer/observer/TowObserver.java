package com.qiaoxg.observer.observer;

import com.qiaoxg.observer.subject.Subject;

public class TowObserver extends Observer {

	private Subject subject;

	public TowObserver(Subject s) {
		this.subject = s;
		this.subject.attach(this);
	}

	public void updateState(int state) {
		System.out.println("TowObserver state changed!! " + state);
	}

}
