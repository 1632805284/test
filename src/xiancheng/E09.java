package xiancheng;

class YieldThread extends Thread{

	public YieldThread(String name) {
		super(name);
		
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+1);
			if(i==2) {
				System.out.println("线程让步：");
				Thread.yield();
			}
		}
	}
}
public class E09 {
	public static void main(String[] args) {
		
	
		new YieldThread("thread1").start();
		new YieldThread("thread2").start();
		
		
}
}
