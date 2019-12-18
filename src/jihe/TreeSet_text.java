package jihe;

import java.util.TreeSet;

public class TreeSet_text {
	public static void main(String[] args) {
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(1);
		ts.add(32);
		ts.add(43);
		ts.add(24);
		ts.add(51);
		ts.add(511);
		ts.add(151);
		System.out.println("创建的treeset集合为："+ts);
		System.out.println("TreeSet集合的首元素为："+ts.first());
		System.out.println("TreeSet集合的尾部元素为："+ts.last());
		System.out.println("TreeSet中大于10的最小元素是："+ts.higher(10));
		System.out.println("TreeSet小于或等于9的最大元素为："+ts.floor(9));
		System.out.println("TreeSet大于100最小元素为："+ts.higher(100));
		Object first=ts.pollFirst();
		Object last=ts.pollLast();
		System.out.println("删除的第一个元素是："+first);
		System.out.println("删除的最后一个元素是："+last);
		System.out.println("删除第一个元素和最后一个元素后TreeSet集合变为："+ts);
	}
}
