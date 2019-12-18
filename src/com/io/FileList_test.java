package com.io;

import java.io.File;
import java.util.Arrays;

public class FileList_test {
	public static void main(String[] args){
		File ml=new File("E:\\0909工作区间");
		fileDir(ml);
	}
//		if(ml.isDirectory()) {
//			String[] zml=ml.list((dir,name)->name.endsWith(".java"));
//			Arrays.stream(zml).forEach(f->System.out.println(f));
//		}
	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		//foreach
		for(File file : wjsz) {
			if(file.isDirectory()) {
				fileDir(file);
			}else if(file.isFile()) {
				String[]zml=ml.list((dir,name)->name.endsWith(".java"));
				Arrays.stream(zml).forEach(f->System.out.println(f));
			}
		}
	}
}
	

