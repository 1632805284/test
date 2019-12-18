package xiancheng;

class DeadLockThread implements Runnable{
	static Object chopsticks = new Object();
	static Object knivesAndFork = new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if (flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"----if----chopsticks");
					synchronized (knivesAndFork) {
					System.out.println(Thread.currentThread().getName()+"----if----knivesAndFork");
					}
				}
			}
		}else {
			while (true) {
				synchronized (knivesAndFork) {
					System.out.println(Thread.currentThread().getName()+"----else----knivesAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"----else----chopsticks");
			}
		}
	}
	
}
	}
public class Thread_test14 {

	public void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1 =new DeadLockThread(true);
		DeadLockThread thread2 =new DeadLockThread(false);
		new Thread(thread1,"chinese").start();
		new Thread(thread2,"Anerican").start();
	}
}
}

