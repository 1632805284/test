package rj0909;
class student{
	static String schoolName;
}
public class E12 {

	public static void main(String[] args) {
		student stu1=new student();
		student stu2=new student();
		student.schoolName="江职";
		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}

}
