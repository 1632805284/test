package jihe;

import java.util.HashSet;
class Student {
	
		String id;
		String name;
			
		public Student(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Student() {
			super();
			// TODO 自动生成的构造函数存根
		}
		@Override
		public int hashCode() {
		// TODO 自动生成的方法存根
		return id.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
			Student other =(Student) obj;
		return id.equals(other.id);
		}
		@Override
		public String toString() {
		return id+":"+name;
	}
}
	public class E10{
		public static void main(String[] args){
			Student s1=new Student("1","Mike");
			Student s2=new Student("1","Mike");
			Student s3=new Student("3","Mary");
			HashSet<Student> hset=new HashSet<Student>();
			hset.add(s1);
			hset.add(s2);
			hset.add(s3);
			System.out.println(hset);
		}
}
