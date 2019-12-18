package rj0909;

public class E_0503 {

	public static void main(String[] args) {
		int [] arr= {9,8,3,5,2};
		for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int z=1;z<arr.length;z++) {
			for(int j=0;j<arr.length-z;j++) {
				
				if (arr[j]>arr[j+1]);{
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
			}
		}
	}
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");}
}
}
