package ljhs;

class Person{
	@Override
	public void finalize() {
		System.out.println("对象将被作为垃圾回收。");
	}
}
public class E37{
	public static void main(String[] args) {
		Person p1=new Person();
		p1=null;
		for(int i = 0;i < 10; i++) {
			System.out.println("方法1循环中.......");
			System.out.println("-----------------------");
			Person p2=new Person();
			p2=null;
			System.gc();
			for(int i1 = 0;i1 < 10; i1++) {
				System.out.println("方法2循环中.......");
			}
		}
	}
}
