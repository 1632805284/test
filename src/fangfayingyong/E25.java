package fangfayingyong;

import Student.student;

@FunctionalInterface
interface printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25{
	private static void printUpper(String text,printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		StringUtils stringUtils=new StringUtils();
		printUpper("Hello", t->stringUtils.printUpperCase(t));
		printUpper("Hello",stringUtils::printUpperCase);
	}
}
