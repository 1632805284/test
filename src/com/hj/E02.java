package com.hj;

public class E02 {
	class Animal{
		public Animal(String name) {
			System.out.println("我是一只"+name);
		}
	}
	class Dog extends Animal{
		public Dog() {
			super("哈士奇");
		}
	}
	public class Animal1{
		public void main(String[] args) {
			Dog dog=new Dog();
		}
		
	}
}
