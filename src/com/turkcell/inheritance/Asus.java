package com.turkcell.inheritance;

public class Asus extends Computer {
	
	private String voiceRecognation;
	
	// parametresiz constructor
	public Asus() {
	}
	
	// parametreli constructor
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognation) {
		super(cpu, ram, smartMainBoard, port);
		this.voiceRecognation = voiceRecognation;
	}
	
	// super classtan gelen özelliði override etmek
	@Override
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Asus ");
	}
	
	@Override
	public String toString() {
		return "Asus [voiceRecognation=" + voiceRecognation + "]";
	}
	
	// getter and setter
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}