package com.turkcell.inheritance;

public class Lenovo extends Computer {
	
	// parametresiz constructor
	public Lenovo() {
		
	}
	
	// parametreli constructor
	public Lenovo(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
	}
	
	// super classtan gelen özelliði override etmek
	@Override
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Lenovo ");
	}
	
	// toString()
	@Override
	public String toString() {
		return "Lenovo [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()="
				+ getSmartMainBoard() + "]";
	}
}
