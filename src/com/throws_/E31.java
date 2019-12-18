package com.throws_;

public class E31 {
	public static int divide(int x,int y)throws Exception {
		int result=x / y;
		return result;
	}

public static void main(String[] args) throws Exception {
	try {
	int result=divide(10, 0);
	System.out.println(result);
	}catch (Exception e) {
	System.out.println("捕获的异常信息为:"+e.getMessage());
	}
	
}
}