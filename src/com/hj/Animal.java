package com.hj;

 class Animal1 {

	String name; 	//声明name属性
	
	//定义动物的叫法
	void shout() {
		System.out.println("发出动物的叫声");
	}
}
	//定义Dog类继承Animal类
	class Dog extends Animal1{
		//方法重写
		void shout() {
			System.out.println("汪汪~");
		}

		public void printName() {
			
			System.out.println("name="+name);
		}
	}
	public  class Animal{
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="沙皮狗";
		dog.printName();
		dog.shout();

	}

	}
