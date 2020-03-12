package com.capg.spring_mobile_demo;

public interface Sim {
	void call();
	void browse();
	default void printAllContacts() {
		System.out.println("No contacts found");
	}

}
