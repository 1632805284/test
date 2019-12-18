//package com.io;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Bjbh {
//	public static void main(String[] args) throws Exception {
//		Path wj=Paths.get("D:\\班级信息.txt");
//		Path bjmc=Paths.get("D:\\求班级编号.txt");
//		Path bjbh=Paths.get("D:\\班级编号.txt");
//		List<String> neirong=new ArrayList<>();
//		Files.createFile(bjbh);
//		List<String> lines=Files.readAllLines(wj);
//		List<String> names=Files.readAllLines(bjmc);
////		System.out.println("文件内容为"+lines);
////		System.out.println("文件大小为"+Files.size(wj)+"个字节");
//		for (String name : names) {
//			for (String line : lines) {
//			String[] zfcsz=line.split("	");
//			if(name.equals(zfcsz[1])) {
//				System.out.println(zfcsz[0]);
//				neirong.add(zfcsz[0]);
//			}
//			
//			
//			}
//		}
//		
//			Files.write(bjbh, neirong, StandardOpenOption.APPEND);
//			
//	}
//}
