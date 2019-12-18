package api;

public class E52 {
	
	public static void main(String[] args) {
		String s1="sdbdnxysdbdnxy.jpg";
		System.out.println("字符串s1的长度是"+s1.length());
		System.out.println("字符串s1的第一个字符是"+s1.charAt(0));
		System.out.println("字符串s1的第三个字符是"+s1.charAt(2));
		System.out.println("字符串s1的第五个字符是"+s1.charAt(4));
		System.out.println("字符串s1的第六个字符是"+s1.charAt(5));
		System.out.println("字符串s1的第七个字符是"+s1.charAt(6));
		System.out.println("字符串s1中字符d的第一次出现的位置是"+s1.indexOf('d'));
		System.out.println("字符串s1中字符d的最后一次出现的位置是"+s1.lastIndexOf(100));
		System.out.println("子字符串nxy第一次出现的位置是"+s1.indexOf("nxy"));
		System.out.println("子字符串nxy最后一次一次出现的位置是"+s1.lastIndexOf("nxy"));
		
	}
}
