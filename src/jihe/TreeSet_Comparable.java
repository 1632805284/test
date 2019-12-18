package jihe;
import java.util.TreeSet;
class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name + ":" + age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
public class TreeSet_Comparable{
	public static void main(String[] args) {
		TreeSet<Teacher> ts =new TreeSet<Teacher>();
		ts.add( new Teacher("赵铁柱",34));
		ts.add( new Teacher("田二妞",35));
		ts.add( new Teacher("张国强",14));
		ts.add( new Teacher("王德发",37));
		System.out.println(ts);
		
		
	}
	
}
