package sortingandsearching;

public class QuickSort {

	public static void main(String[] args) {
		int data[]= {8,7,2,1,0,9,6};
		quickSort(data,0,data.length-1);
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");

	}

	private static void quickSort(int[] data, int low, int high) {
		if(low<high) {
			//find pivot element such that 
			//element smaller than pivot are on left side
			//element greater than pivot are on right side
			int pivot=partition(data,low,high);
			quickSort(data,low,pivot-1);
			quickSort(data,pivot+1,high);
		}
		
	}

	private static int partition(int[] data, int low, int high) {
		//chosse rightmost element as pivot
		int pivot=data[high];
		//pointer for greater value
		int i=low-1;
		//traverse through all element 
		//compare each element with pivot
		for(int j=low;j<high;j++) {
			if(data[j]<=pivot) {
				//if element is smaller than pivot then swap it with greater element pointed by i
				i++;
				//swap element at i with element at j
				int temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		
		}
		//swapping wlwment at i with the element at j
		int temp=data[i+1];
		data[i+1]=data[high];
		data[high]=temp;
		return i+1;
	}

}
