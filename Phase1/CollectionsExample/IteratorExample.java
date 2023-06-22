package CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("Heena");
		list.add("Manish");
		list.add("Babita");
		list.add("Kavish");
		list.add(null);
		list.add("Heena");
		//System.out.println("ArrayList Elements:" + list);
		Iterator<String> obj=list.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		for(String val : list) {
			System.out.println(val);
		}
		list.set(list.indexOf("Babita"),"Kanika");
		System.out.println(list);
	}

}
