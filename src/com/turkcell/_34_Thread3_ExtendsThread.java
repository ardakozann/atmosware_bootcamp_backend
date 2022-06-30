package com.turkcell;

public class _34_Thread3_ExtendsThread extends Thread {
	
	private String className;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public _34_Thread3_ExtendsThread() {
		
	}
	
	public _34_Thread3_ExtendsThread(String className) {
		this.className = className;
	}
	
	// run metodu
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				// 1000ms = 1sn uyu
				Thread.sleep(1000);
				System.out.println(this.className + " " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
