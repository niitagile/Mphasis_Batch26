package ArrayExamples;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		//int array[5]; Error
		
		int array[]=new int[]{34,56,23,78};
		System.out.println("Total Elements:::"+array.length);
		
		int marks[]=new int[5];
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		marks[3]=78;
		System.out.println("After Modification");
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		System.out.println(marks[2]);
		
	}

}
