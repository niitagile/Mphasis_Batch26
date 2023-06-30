package sortingandsearching;



public class CLL {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static CLL insert(CLL list, int data) {

		// Create a new node with given data
		Node new_node = new Node(data);
		
		// If head is null - insert first node
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last;
			// to move pointer to last node to insert new node
			for (last = list.head; last.next != list.head; last = last.next) {
			}
			last.next = new_node;
		}
		//System.out.println(new_node.data);
		new_node.next = list.head;
		return list;
	}

	public static void printList(CLL list) {
		Node last = list.head;
		do {  
				
			System.out.print(last.data + " ");
			last = last.next;

		}while( last != list.head);
		System.out.println();
	}

	public static void main(String[] args) {
		CLL list = new CLL();
		list = insert(list, 23);
		list = insert(list, 12);
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		printList(list);
	}
}
