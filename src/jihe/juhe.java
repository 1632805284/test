package jihe;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class juhe {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("聂晓誉");
		list.add("聂大誉");
		list.add("聂老誉");
		list.add("晓聂誉");
		//
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		System.out.println("=========");
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("聂"));
		System.out.println("集合里所有姓聂的人：");
		liu3.forEach(j->System.out.println(j));
		System.out.println("=========");
		System.out.println("集合里所有姓聂的人：");
		list.stream().filter(k->k.startsWith("聂"))
		.skip(1)
		.limit(2).forEach(j->System.out.println(j));
		 
		
		
		System.out.println(list.stream().filter(k->k.startsWith("聂"))
		.collect(Collectors.joining("和")));
			
	}

}
