package c1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void showList()
	{
		ArrayList<String>lst=new ArrayList<String>();
		lst.add("abcd");
		lst.add("xyz");
		lst.add("bbb");
		lst.add("10");
		lst.add("20");
		lst.add("bbb");
		lst.add(2,"cc");
		System.out.println("Size" +lst.size());
		System.out.println("Removed" +lst.remove(3));
		System.out.println("Size after removal" +lst.size());
		Iterator<String>it=lst.iterator();
		Object obj=Collections.min(lst);
		System.out.println("min" +obj);
		obj=Collections.max(lst);
		System.out.println("max " +obj);
		Collections.sort(lst);
		for(String str:lst)
		{
			System.out.println(str);
		}
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showList();
	}

}
