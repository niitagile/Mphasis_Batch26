package sortingandsearching;

public class RecMergeSort {

		static void mergeSort(int a[],int beg, int end) {
			if(beg<end) {
				int mid=(beg+end)/2;
				mergeSort(a,beg,mid);
				mergeSort(a,mid+1,end);
				merge(a,beg,mid,end);
			}
		}
	private static void merge(int[] a, int beg, int mid, int end) {
			
			 int i,j,k;
			 int n1=mid-beg+1;
			 int n2=end-mid;
			 //temporary arrays
			 int LeftArray[]=new int[n1];
			 int RightArray[]=new int[n2];
			 //copy data to temp arrays
			 for(i=0;i<n1;i++)
				 LeftArray[i]=a[beg+i];
			 for(j=0;j<n1;j++)
				 RightArray[j]=a[mid+1+j];
			 i=0;j=0;k=beg;
			 
			 while(i<n1 && j<n2) {
				 if(LeftArray[i]<=RightArray[j]) {
					 a[k]=LeftArray[i];
					 i++;
				 }
				 else
					 {
						 a[k]=RightArray[j];
						 j++;
					 }
				 k++;
			 }
			 while(i<n1) {
				 a[k]=LeftArray[i];
				 i++;
				k++;
			 }
			 while(j<n2) {
				 a[k]=RightArray[j];
				 j++;
				k++;
			 }
			 	
		}
	public static void main(String[] args) {
		int a[]= {11,30,24,7,31,16,39,41};
		
		System.out.println("Before Sort");
		print(a);
		mergeSort(a,0,a.length-1);
		System.out.println("After Sort");
		print(a);
		

	}
	private static void print(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}

}
