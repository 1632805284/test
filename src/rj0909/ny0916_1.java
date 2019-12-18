package rj0909;

import java.util.GregorianCalendar;

public class ny0916_1 {

	public static void main(String[] args) {
		int[]array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		for(int szys:array) {
			System.out.println(szys+"");
		}
		System.out.println();
		for(int m=1;m<array.length;m++) {
			for (int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1]) {
					int temp=array[n];
					array[n+1]=temp;
				}
			}
		}
	}

}
