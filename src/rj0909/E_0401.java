package rj0909;

public class E_0401 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		System.out.println("十六进制以0x开头"+0xc6);
		
		System.out.println("单精度浮点型以f结尾"+5.022+6f);
		System.out.println("双精度浮点型以d结尾"+5.002+6d);
		System.out.println("双精度可以省略d"+5.002+6);
		//java中的字符使用单引号，采用16位unicode编码，用\\uXXXX来表示
		System.out.println("我叫"+'\u8042'+'\u6653'+'誉');
		//java中的字符串使用双引号
		System.out.println("hello,\nseptember!");
		//java中的布尔常量只有两个，真true 假false
		System.out.println("布尔常量"+true+"或者"+false);
		//java中的null常量，只能是引用数据类型
		System.out.println("null常量只有一个"+null+",表示对象");
		E_0401 changliang=null;
		//同变量类似的常量要使用final关键字，常量被赋值后不能再次被修改，常量一般用大写字母；
		final int A=5;//定义一个整型变量a，如果前面加final修饰它就变成一个常量
		//a=6;
	}

}
