package com.capg.spring_mobile_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("mobile")
public class Mobile {

	@Autowired
	@Qualifier("vodafone")
Sim sim;
	
	
	
//	public Sim getSim() {
//		return sim;
//	}
//
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}

	public void makeACall() {
		sim.call();
	}
	
	public void browseInternet() {
		sim.browse();
	}
	
	public void printAllContacts() {
		sim.printAllContacts();
	}
}
//Sim s;
//
//public Sim getS() {
//	return s;
//}
//
//public void setS(Sim s) {
//	this.s = s;
//}
//
//void makeACall() {
//	s.call();
//}
//
//void browseInternet() {
//	s.browse();
//}