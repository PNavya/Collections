package c1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void showMap()
	{
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"one");
		map.put(5,"two");
		map.put(2,"three");
		map.put(6,"four");
		map.put(3,"six");
		/*//Collection<String>set=map.values();
		Set<Integer>set=map.keySet();
		Iterator<Integer>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry mentry=(Map.Entry)it.next();
			System.out.println("Key:" +mentry.getKey()+ "&Value is:");
			System.out.println(mentry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMap();

	}

}
