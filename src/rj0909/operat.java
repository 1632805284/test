package rj0909;

public class operat {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		System.out.println("后加"+(i++));
		System.out.println("先加"+(++j));
		System.out.println("不管先加还是后加以后变量的值都加了1，i="+i);
		System.out.println("不管先加还是后加以后变量的值都加了1，j="+j);
		int a=2;
		a+=3;
		System.out.println(a);
		String s1="hi";
		String s2="hi";
		E_04 e1=new E_04();
		E_04 e2=new E_04();
		
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		
	}

}
