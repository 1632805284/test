package rj0909;

public class E_0502 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<100;i=i+2){
		sum=sum+i;
		}
		System.out.println("sum="+sum);
		
		sum=0;
		int i=2;
		while (i<=100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println("sum="+sum);
	}

}
