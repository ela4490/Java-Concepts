package com.cop.part1.startingThreads;

class RunnableApp implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Thread " + i + " running.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class ThreadUsingRunnableInterface {
	
	public static void main(String args[]) {
		
		RunnableApp runnableObj1 = new RunnableApp();
		Thread t1 = new Thread(runnableObj1);
		t1.start();
		
		RunnableApp runnableObj2 = new RunnableApp();
		Thread t2 = new Thread(runnableObj2);
		t2.start();
	}
}
