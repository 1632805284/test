package xiancheng;

import java.util.concurrent.*;

class MyThread6 implements Callable<Object>{
	public Object call() throws Exception{
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call（）方法正在运行Orz");
			
			
		}
		return i;
	}
}
public class Thread_test16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自动生成的方法存根
		MyThread6 mt6=new MyThread6();
		ExecutorService pool=Executors.newCachedThreadPool();
		Future<Object> result1=pool.submit(mt6);
		Future<Object> result2=pool.submit(mt6);
		pool.shutdown();
		System.out.println("thread-1返回结果"+result1.get());
		System.out.println("thread-2返回结果"+result2.get());

	}

}
