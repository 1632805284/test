package com.io;

import java.io.File;

public class E15 {

	public static void main(String[] args) {
		File file=new File("D:\\18软件2班作业");
		fileDir(file);
		

	}
	public static void fileDir(File file) {
		File[] listFiles =file.listFiles();
		for(File files :listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
