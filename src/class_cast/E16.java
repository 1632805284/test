package class_cast;
interface Animal{
	void shout();

	void catchMouse();
}
class Cat implements Animal{
	public void shout() {
		System.out.println("喵喵~~~");
	}
	public void catchMouse() {
		System.out.println("小猫是抓老鼠的");
	}
	public void eatMan() {
		// TODO 自动生成的方法存根
		
	}
}
class Pig implements Animal{

	@Override
	public void shout() {
		System.out.println("henhen````");
		
	}

	@Override
	public void catchMouse() {
		// TODO 自动生成的方法存根
		
	}


	
}
public class E16 {

	public static void main(String[] args) {
		
		Animal an1=new Pig();
		if(an1 instanceof Cat){
			Cat cat=(Cat)an1;
			cat.shout();
			cat.eatMan();
		}
		else {
			System.out.println("这个动物不是猫");
		}
	}

}
