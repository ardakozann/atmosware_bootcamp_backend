package com.turkcell.abstractx;

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
	public void govdeliMethod() {
		super.govdeliMethod();
		System.out.println("Lenovo ");
	}
	
	// gövdesiz metot
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Lenovo Gövdesiz metot: " + name);
		
	}
	
	// toString()
	@Override
	public String toString() {
		return "Lenovo [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()="
				+ getSmartMainBoard() + "]";
	}
}
