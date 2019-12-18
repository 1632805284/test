package rj0909;

public class lx101_2 {
	public static int f(int n) {
		//递归方法最后一定要有终止的值
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=8;
		System.out.println("斐波那契数列第"+a+"数是"+f(a));
	}

}
