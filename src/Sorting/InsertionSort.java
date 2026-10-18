package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={78,89,45,23,89,12,90};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
