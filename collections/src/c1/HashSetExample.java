package c1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void showHash()
	{
		HashSet<String>set=new HashSet<String>();
		set.add("six");
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
		showHash();

	}

}
