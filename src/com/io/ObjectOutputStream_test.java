package com.io;

import java.awt.event.MouseWheelEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Student.person;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\obj.txt"));
		Person p1=new Person("mike",40);
		out.writeObject(p1);

		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name is "+person.getName());
		System.out.println("age is "+person.getAge());
	}

}
