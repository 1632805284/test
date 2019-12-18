package Student;

public class student extends person{
	private String name;//姓名
	private int score;//成绩
//构造方法 修饰符public+类名（）{}
//无参构造方法
public student() {}
//有参数的构造方法
public student(String mz,int cj) {
	this.name=mz;
	this.score=cj;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

}
class A{
	void ad() {}
}
class B extends A{}
class C extends A{}