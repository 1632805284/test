package Student;

public class lx102_4 {
	public lx102_4() {
		System.out.println("构造方法一被调用了");
	}
public lx102_4(int x) {
	this();
	System.out.println("构造方法二被调用了");
}
public lx102_4(boolean b) {
	this(1);
	System.out.println("构造方法三被调用了");
}
	public static void main(String[] args) {
		
		new lx102_4(true);

	}

}
