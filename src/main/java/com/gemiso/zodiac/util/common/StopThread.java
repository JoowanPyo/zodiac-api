package com.gemiso.zodiac.util.common;

public class StopThread implements Runnable {

	@Override
	public void run() {

		try {

			while (!Thread.currentThread().isInterrupted()) {

				System.out.println("thread is sleeping....");

				Thread.sleep(10000);

				
				//Thread.interrupted();
				
				
				System.out.println("thread is live");
			}

		} catch (Exception e) {

		} finally {
			System.out.println("thread is dead");
		}
	}
}
