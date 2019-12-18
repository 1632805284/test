package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class FileinputStream_test {

	public static void main(String[] args) throws Exception  {
		long kssj=System.currentTimeMillis();
		
		FileInputStream in=new FileInputStream("d:\\1.jpg");
		
		FileOutputStream out=new FileOutputStream("1.jpg");
		byte[]zjhc=new byte[1024];
		int b=in.read(zjhc);
		//int b=in.read();
		while (b!=-1){
			//System.out.println(b);
			out.write(zjhc,0,b);
			b=in.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝1.2mb的图片文件耗时"+(jssj-kssj)+"毫秒");
		//out.write(",come on!".getBytes());
		in.close();
		out.close();
	}

}
