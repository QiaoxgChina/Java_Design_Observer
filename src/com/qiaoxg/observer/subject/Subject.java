package com.qiaoxg.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.qiaoxg.observer.observer.Observer;

public class Subject {

	private List<Observer> observers = new ArrayList();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyUpdate();
	}

	public void attach(Observer obs) {
		observers.add(obs);
	}

	public void notifyUpdate() {
		for (Observer obs : observers) {
			obs.updateState(this.state);
		}
	}

}
