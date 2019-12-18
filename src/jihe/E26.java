package jihe;

import java.util.ArrayList;
import java.util.Collections;

public class E26 {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		Collections.addAll(list, 4,2,6,-9,3);
		System.out.println("集合中的元素"+list);
		System.out.println("集合中的最大元素"+Collections.max(list));
		System.out.println("集合中的最小元素"+Collections.min(list));
		Collections.replaceAll(list, 3, 0);
		System.out.println("替换后的集合"+list);
		Collections.sort(list);
		System.out.println("集合排序后为："+list);
		int index=Collections.binarySearch(list,3);
		System.out.println("集合通过二分查找方法找元素3所在角标为："+index);
	}
}
