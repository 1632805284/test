package jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_text {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"赵","钱","孙","李","周");
		System.out.println("排序前"+list);
		Collections.reverse(list);
		System.out.println("反转后"+list);
		Collections.sort(list);
		System.out.println("自然排序后"+list);
		Collections.shuffle(list);
		System.out.println("随机排序后"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后"+list);
		
		
		
	}
	
}
