package xiancheng;

import java.util.ArrayList;
import java.util.List;

public class Thread_test15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Object>goods=new ArrayList<Object>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()-> {
			int num=0;
			while (System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if (goods.size()>0) {
					try {
						goods.wait();
					}catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					} else{
						goods.add("商品"+(++num));
						System.out.println("生产商品"+num);
					}
				
				
				}
				
			}},"生产者路线");
		Thread thread2=new Thread(()-> {
			int num=0;
			while (System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if (goods.size()<=0) {
					
						goods.notify();
					}else{
						goods.add("商品"+(++num));
						System.out.println("消费商品"+num);
					}
				
				
				}
			}},"消费者路线");
			thread1.start();
			thread2.start();
		}
	}


