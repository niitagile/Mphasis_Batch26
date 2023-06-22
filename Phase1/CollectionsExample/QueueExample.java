package CollectionsExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> name=new ArrayDeque<>();
			name.add("Kavita");
			name.add("Sunil");
			name.add("Nisha");
			name.add("Monica");
			//name.add(null); null are not allowed
			
			System.out.println(name);
			
			
			System.out.println(name.poll());//poll prints and remove the values
			System.out.println(name.poll());
			System.out.println(name.poll());
			System.out.println(name.poll());
			System.out.println(name.poll());//poll returns null if value is not available 
			
			System.out.println(name.isEmpty());
			
			
		//Internall Priorty queue uses Heap tree to manage all data
		/*PriorityQueue<String> name=new PriorityQueue<>();
		name.add("Kavita");
		name.add("Sunil");
		name.add("Nisha");
		name.add("Monica");
		name.add("Sunil");
		name.add("Sunil");
		//name.add(null); //throw exception
		System.out.println(name);*/
		
		
	}
}
