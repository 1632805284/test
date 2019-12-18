package rj0909;

public class E_0501 {

	public static void main(String[] args) {
		int age=17;
		if (age<12) {
			System.out.println("此人是儿童");
		}
		else if (age<18) {
			System.out.println("此人不能玩亚索");
			
		int month=14;
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬天");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋天");
				break;
			
			default:
				System.out.println("AYO everybody在你頭上暴扣");
				break;
		}
		}
	}

}
