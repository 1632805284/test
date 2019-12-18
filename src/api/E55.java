package api;

public class E55 {
	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1转成大写后是"+s1.toUpperCase());
		System.out.println("整数12转成字符串是"+String.valueOf(12));
		String s2="    www     .439   9.c    o      m";
		System.out.println("字符串去掉两端空格后是"+s2.trim());
		System.out.println("字符串去掉所有空格后是"+s2.replace(" ",""));
		System.out.println("字符串只留空格后是"+s2.replaceAll("\\S+", ""));
	}
}
