package api;

public class E53 {
	public static void main(String[] args) {
		String s1="abcdefghljk";
		String s2="jkxyz";
		System.out.println("判断字符串是否以ab开头("+s1.startsWith("ab")+")");
		System.out.println("判断字符串是否以opq结尾("+s1.endsWith("opq")+")");
		System.out.println("判断字符串是否包含cd("+s1.contains("cd")+")");
		System.out.println("判断字符串是否为空("+s1.isEmpty()+")");
		System.out.println("判断字符串是否相等("+s1.equals(s2)+")");
	}
}
