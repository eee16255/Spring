package com.capg.spring_mobile_demo;

public class Mobile {
    Sim s;
	
	public Sim getS() {
		return s;
	}

	public void setS(Sim s) {
		this.s = s;
	}

	void makeACall() {
		s.call();
	}
	
	void browseInternet() {
		s.browse();
	}

}
