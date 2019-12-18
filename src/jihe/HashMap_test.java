package jihe;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "John");
		map.put("2", "Mary");
		map.put("3", "Lucy");
		map.put("4", "Black");
		map.put("1", "Tom");
		System.out.println(map);
		System.out.println(map.containsKey("1"));
		System.out.println(map.get("1"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.replace("1","Tom");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
		
		if (map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合包中键1的值是"+map.get("1"));
			}
		
			System.out.println("这个双列集合中所有键的集合是"+map.keySet());
			System.out.println("这个双列集合中所有键的集合是"+map.values());
			map.replace("1", "Andy");
			System.out.println(map);
			
			System.out.println("用双键集遍历双列集合的建和值");
			Set<String> jianji=map.keySet();
			Iterator<String> diedai=jianji.iterator();
			while (diedai.hasNext()) {
				Object key = diedai.next();
				Object value=map.get(key);
				System.out.println(key+":"+value);
			
				
			}
			System.out.println("用键值对集遍历双列集合的键值和");
			Set<?> jianzhiduiji=map.entrySet();
			Iterator<?> diedai2=jianzhiduiji.iterator();
			while(diedai2.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry jianzhidui =(Map.Entry) diedai2.next();
				Object key =jianzhidui.getKey();
				Object value=jianzhidui.getValue();
				System.out.println(key+":"+value);
			}
			map.forEach((key,value)->System.out.println(key+":"+value));
			Collection<String> value=map.values();
			value.forEach(V -> System.out.println(V));
			
			
			
			Map<String, String> map2 =new LinkedHashMap<String, String>();
			map2.put("1", "jinx");
			map2.put("2", "jihn");
			map2.put("3", "zed");
			System.out.println(map2);
	}
	}


