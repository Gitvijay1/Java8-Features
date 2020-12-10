package com.nt;

public class TreadDemo extends Thread{
	public static void main(String[] args) {
		
		//using Anonymous class
		/*Thread t=new Thread() {
			public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("child Thread");
			}
	       }
		};
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}*/
		
		//using lambda expression
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("child Thread");
		}
	};
	Thread t=new Thread(r);
	   t.start();
	   for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
