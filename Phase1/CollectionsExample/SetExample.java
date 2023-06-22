package CollectionsExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		/*HashSet<String> hlist =new HashSet<>();
		hlist.add("Heena");
		hlist.add("Manish");
		hlist.add("Babita");
		hlist.add("Kavish");
		hlist.add(null);
		hlist.add("Heena");
		System.out.println("HashSet Elements:" + hlist);*/
		//LinkedHashSet
		LinkedHashSet<String> nlist =new LinkedHashSet<>();
		nlist.add("Heena");
		nlist.add("Manish");
		nlist.add("Babita");
		nlist.add("Kavish");
		nlist.add(null);
		nlist.add("Heena");
		System.out.println("LinkedHashSet Elements:" + nlist);
		
		//TreeSet
		/*TreeSet<String> tlist =new TreeSet<>(); //Derived from SortedSet
		tlist.add("Heena");
		tlist.add("Manish");
		tlist.add("Babita");
		tlist.add("Kavish");
		//tlist.add(null); //not allowed in treeset
		tlist.add("Heena");
		System.out.println("TreeSet Elements:" + tlist);
		NavigableSet<String> rlist=tlist.descendingSet();
		System.out.println("Reverse Order: "+rlist);*/
	}

}
