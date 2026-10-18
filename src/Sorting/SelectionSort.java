package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={78,89,45,23,54,12,90};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
