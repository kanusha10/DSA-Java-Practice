package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition2(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition1(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]>pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }

    public static int partition2(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        for(int j=low+1;j<high;j++){
            if(arr[j]>pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void main(String[] args){
        int[] arr={78,89,45,23,89,12,90};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
