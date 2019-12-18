package rj0909;

import java.io.Serializable;

public class Lei extends Object implements Serializable {
	//定义四个内部类
	//class是关键字 class钱面可以添加修饰符
	//第一种修饰符是作用范围： public公有的  protected受保护的   private私有的
	//static静态的 
	public static final class A extends Object implements Serializable{}
	protected static final class B extends Object implements Serializable{}
	static final class C extends Object implements Serializable{}
	private static final class D extends Object implements Serializable{}
	//定义两个成员变量
	public static final int age=20;
	public static final String name="";
	//定义两个成员方法 修饰符+返回数据类型+成员方法名([参数类型 参数名]){}
	//修饰符可以多一个synchronized：同步的，一般不要写
	//返回值类型为void(空的)，方法体里不需要return语句
	//其他返回值类型，方法体里都需要return语句
	public synchronized void setAge(int nianliang) {}
	public synchronized int getAge() {return 0;}
}
