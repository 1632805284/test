package com.final_;
//使用final关键字修饰符Animal类
class Animal{
	@Override
	
	public String toString() {
		return "这是一只小狗";
	}
}
//DOg类继承Animal类
class Dog extends Animal{
	
	@Override
public String toString() {
	return "这是一只小动物";
}
}
public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog dw2=new Dog();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());

	}

}
