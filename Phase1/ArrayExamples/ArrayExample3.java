package ArrayExamples;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array[][]=new int[][]{{23,34,56},{45,67,89}};	
			
			System.out.println("rows="+array.length);
			System.out.println("element in Ist row="+array[0].length);
			System.out.println("element in IInd row="+array[1].length);
			System.out.println("element in IIIrd row="+array[2].length);
			
			for(int row=0;row<array.length;row++){
				
				for(int col=0;col<array[row].length;col++){
					System.out.print(array[row][col]+" ");
				}
				System.out.println();
			}
	}

}
