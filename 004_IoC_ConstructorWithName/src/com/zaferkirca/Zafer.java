package com.zaferkirca;

public class Zafer {
	
	private String name;
	private int yas;
	
	public Zafer(String name, int yas) {
		this.name = name;
		this.yas = yas;
	}
	
	public void sloganAt() {
		System.out.println(name + " Bizimdir!");
		System.out.println("Yas : " + yas);
	}
}