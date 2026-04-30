package ListRefCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MyList {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
//		list.add("Ram");
//		list.add("Shyam");
//		list.add("Ram");
//		list.add("Ram");
//		list.add('@');
//		list.add('@');
//		list.add(null);
//		list.add(null);
//		list.add(true);
//		list.add(null);
//		list.add(450000.67);
//		list.add(null);
//		list.add(true);

//		System.out.println(list.get(13));

//		System.out.println(list);

//		for(Object obj : list) {
//			System.out.println(obj);
//		}

//		Vector<String> list = new Vector<String>();
//		list.add("Ram");
//		list.add("Shyam");
//		list.add("vraj");
//		list.add("raj");
//		list.add("vishal");
//		list.add("vraj");
//		list.add("vraj");
//
//		for (String str : list) {
//			System.out.println(str);
//		}

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3456);
		list.add(346);
		list.add(323456);
		list.add(3423456);
		list.add(3434556);
		list.add(3324456);
		list.add(33456);

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(34234556);
		list1.add(323446);
		list1.add(323456);
		list1.add(3423456);
		list1.addAll(list);

//		System.out.println(list1.contains(343443));
//		System.out.println(list1.remove(0));
//		System.out.println(list1.isEmpty());
//		System.out.println(list1.getFirst());

//		for (Integer r : list1) {
//			System.out.println(r);
//		}

	}

}
