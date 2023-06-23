package ArrayExamples;

public class ArrayExample4 {
//jagged Array- different no of elements in rows
	public static void main(String[] args) {
		int array[][]=new int[][]{{23,34,56},{45,89}};	
		
		for(int row=0;row<array.length;row++){
			for(int col=0;col<array[row].length;col++){
				System.out.print(array[row][col]+" ");
			}
			System.out.println();
		}

	}

}
