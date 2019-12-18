package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InoutStreamReader_test {

	public static void main(String[] args)throws Exception {
		//InputStream jpsr=System.in;
		//InputStreamReader ir=new InputStreamReader(jpsr);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		System.out.println("请输入您的姓名：");
		String line=br.readLine();
		bw.write("您叫"+line);
		br.close();
		bw.flush();
		br.close();
		//BufferedReader br=new BufferedReader(ir);
//		System.out.println("请输入年龄：");
//		String line=br.readLine();
//		System.out.println("您的年龄是："+line);
//		int age =Integer.parseInt(line);
//		System.out.println("您明年的年龄是"+(age+1)+"岁");
//		
	}

}
