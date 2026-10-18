package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr={78,89,45,23,89,12,90};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
