package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {
	public static void main(String[] args)  {
	CharBuffer cbf=CharBuffer.allocate(6);
	System.out.println("这个字符缓冲区容量是："+cbf.capacity());
	System.out.println("这个字符缓冲区界限值是："+cbf.limit());
	System.out.println("这个字符缓冲区初始位置是："+cbf.position());
	cbf.put('a');cbf.put('b');cbf.put('c');
	System.out.println("添加3个元素以后这个字符缓冲区容量是："+cbf.capacity());
	System.out.println("添加3个元素以后这个字符缓冲区界限值是："+cbf.limit());
	System.out.println("添加3个元素以后这个字符缓冲区初始位置是："+cbf.position());
	cbf.flip();
	System.out.println("添加3个元素并反转之后这个字符缓冲区容量是："+cbf.capacity());
	System.out.println("添加3个元素并反转之后这个字符缓冲区界限值是："+cbf.limit());
	System.out.println("添加3个元素并反转之后这个字符缓冲区初始位置是："+cbf.position());
	System.out.println(cbf.get());
	
	}
}
