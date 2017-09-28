package com.qiaoxg.observer.observer;

import com.qiaoxg.observer.subject.Subject;

public class OneObserver extends Observer {

	private Subject subject;

	public OneObserver(Subject s) {
		this.subject = s;
		this.subject.attach(this);
	}

	public void updateState(int state) {
		System.out.println("OneObserver state changed! " + state);
	}

}
