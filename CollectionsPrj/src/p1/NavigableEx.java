package p1;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableEx {

	public static void show()
	{
		NavigableSet<String>nset=new TreeSet<>();
		nset.add("element1");
		nset.add("element2");
		nset.add("element3");
		nset.add("element4");
		nset.add("element5");
		NavigableSet<String>it=nset.descendingSet();
		System.out.println("Descending Set "+it.toString());
		System.out.println(nset);
		/*Iterator<String>it1=nset.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/
		SortedSet<String>s1=nset.headSet("element4",true);
		System.out.println(s1);
		SortedSet<String>s2=nset.tailSet("element4", false);
		System.out.println(s2);
		SortedSet<String>s3=nset.subSet("element2","element2");
		System.out.println(s3);
		
	}
	public static void main(String[] args) {
		show();
	}

}
