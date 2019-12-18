package com.interface_;



interface Aniaml{
	//接口的成员变量声明，可以省略public static final三个关键字
	int ID=1;
	//接口的普通成员方法是可以省略public abstract两个关键字
	
	void shout();
	static int getID() {
		return Aniaml.ID;
	}
}
interface LandAniaml extends Aniaml{
void run();	
}
class Dog implements LandAniaml{
	public void shout() {
		System.out.println("汪汪······");
	}

	@Override
	public void run() {
		System.out.println("顾子维一只小狗");
		
	}
}




public class E13 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
	}

}

