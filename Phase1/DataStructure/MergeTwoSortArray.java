package ssearchingsorting;

import java.util.Arrays;

public class MergeTwoSortArray {

	 void print(int[] arr){
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
     int[] merge(int arr1[],int arr2[],int n,int m){
         int[] result=new int[n+m];
         int i=0;
         int j=0;
         int k=0;
         while(i<n && j<m){
             if(arr1[i]<arr2[j]){
                 result[k]=arr1[i];
                 i++;
             }
             else if(arr1[i]>arr2[j]){
                 result[k]=arr2[j];
                 j++;
             }
             else{
            	 result[k]=arr1[i];
            	 i++;
            	 j++;
             }
             k++;
         }
         while(i<n){
             result[k]=arr1[i];
             i++;k++;
         }
         while(j<m){
             result[k]=arr2[j];
             j++;k++;
         }
         return result;
     }
     
     public static void main(String []args){
         MergeTwoSortArray msa=new MergeTwoSortArray();
         int[] arr1={0,1,8,10};
         int[] arr2={2,4,11,15,20};
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         msa.print(arr1);
         msa.print(arr2);
         int[] result=msa.merge(arr1,arr2,arr1.length,arr2.length);
         msa.print(result);
         
         
     }
}
