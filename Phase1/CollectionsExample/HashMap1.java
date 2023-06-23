package CollectionsExample;
//Question create a map to store a word and its meaning. user will give a word and require to
//search its meaning in map
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap1 {

	public static void main(String[] args) {
		//HashMap<Integer,String> h=new HashMap<Integer, String>(); Arranging data according to Hashing
	//LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer, String>(); // arrange insertion order
	TreeMap<Integer,String> h=new TreeMap<Integer, String>();//derived from SortedMap
	h.put(1, "imran");
	h.put(2, "armaan");
	h.put(3, "arijit");
	h.put(4, "shreya");
	h.put(5, "armaan");
	h.put(7, "arijit");
	h.put(6, "armaan");
	h.put(8, "arijit");
	h.put(2,"amrita");
	//h.put(null, "Nikita"); //TreeMap doen't all null value but others allow
	h.put(2, "Bhargav");
	
	
	System.out.println("Size of map "+h.size());
	System.out.println("printing the contents");
	for(Integer key:h.keySet()){
		String name=h.get(key);
		System.out.println(key+ " "+name);
	}
	h.remove(2);
	System.out.println("===============After deleting 2nd ============");
	for(Integer key:h.keySet()){
		String i=h.get(key);
		System.out.println(key+ " "+i);
	}
	System.out.println();
	System.out.println("is the map contains anything " +h.isEmpty());
	System.out.println("is the map contains 2 "+h.containsKey(2));
	System.out.println("is the map contains shreya "+h.containsValue("Shreya"));
	
	

	}

}
