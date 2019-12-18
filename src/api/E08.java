package api;

import java.util.ArrayList;
import java.util.Iterator;

public class E08 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		Iterator it=list.iterator();
		it.forEachRemaining(obj->System.out.println("迭代集合元素："+obj));

	}

}
