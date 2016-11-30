package c1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void showTree()
	{
		TreeSet<String>set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("five");
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showTree();
	}

}
