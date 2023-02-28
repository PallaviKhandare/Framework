package a1_collection;

import java.util.List;
import java.util.ArrayList;

public class a1 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add("Tom");
		list.add('A');
		System.out.println(list);
		System.out.println(list.get(1));

	}

}
