package jihe;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonModel_stream_test {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		List<personModel> list=new ArrayList<>();
		personModel p1=new personModel("nie xiao yu",18,"男");
		personModel p2=new personModel("chen long",29,"男");
		personModel p3=new personModel("guo lao ban",17,"男");
		personModel p4=new personModel("yang da lao",117,"女");
		list=Arrays.asList(p1,p2,p3,p4);
	
	for (personModel pm : list) {
		System.out.println(pm.getName());
	}
	List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
	System.out.println(list2);
	List<String> list3=list.stream().map(personModel::getName).collect(Collectors.toList());
	System.out.println(list3);
	List<String> list4=list.stream().map(a->{return a.getName();}).collect(Collectors.toList());
	System.out.println(list4);
}
}
