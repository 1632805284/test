package com.hj;
class Animel extends java.lang.Object{
	//定义动物叫的方法
		void shout() {
			System.out.println("动物叫！");
		}
		@Override
		public String toString() {
			return "这是一只动物";
}
}
	public class E06 {
	

	public void main(String[] args) {
		Animal animal=new Animal();
		System.out.println(animal.toString());
	}

}
