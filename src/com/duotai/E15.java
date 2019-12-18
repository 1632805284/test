package com.duotai;

abstract class Animal{
	abstract void shout();
}
class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵~~~~~");
	}
}




class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪·······");
	}
}


public class E15 {

	public static void main(String[] args) {
	Animal an1=new Cat();
	Animal an2=new Dog();
	an1.shout();
	an2.shout();
	}

}
