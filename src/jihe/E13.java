package jihe;

import java.util.Comparator;
import java.util.TreeSet;

class Mycomparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String s1= (String) obj1;
		String s2= (String) obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}
}
public class E13 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new Mycomparator());
		ts.add("聂晓誉");
		ts.add("谢雷");
		ts.add("陈龙傻逼");
		System.out.println(ts);
		TreeSet<String> ts2=new TreeSet<String>((obj1,obj2)-> {
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
			
		});
		ts2.add("聂晓誉");
		ts2.add("谢雷");
		ts2.add("陈龙傻逼");
		System.out.println(ts2);
	}
}
