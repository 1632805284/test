package xiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow5 extends Thread{
	
	private int tickets = 10;
    private final Lock lock=new ReentrantLock();
	public void run() {
		while (true) {
			lock.lock();
				if(tickets>0) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");

			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				lock.unlock();
				}
			}
		}
	}

		
	

	
}


public class Thread_test13 {

	public static void main(String[] args) {
		TicketWindow5 tw =new TicketWindow5();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
		

	}

}
