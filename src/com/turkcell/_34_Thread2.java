package com.turkcell;

// Thread kullanım şekiller
// 1-) extends (Kalıtım) => public class MultiThreadExam extends Thread{}
// => extends javada 1 tane kullanabilirsin. (Run metotudunu override etmek
// zorunlu değildir.)

public class _34_Thread2 extends Thread {
	
	@Override
	public void run() {
		
	}
}

// 2-) implements (interface) => public class MultiThreadExam implements
// Runnable {}
// => implements 1'den fazla kullanabilirsin

class _34_Thread2Implements implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

// 3-) anonymous (isimsiz) ==> metot olarak
// Thread thread = new Thread(new Runnable(){});

class _34_Thread3Method {
	public void threadhMetotu() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}