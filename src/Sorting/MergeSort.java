package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] l=new int[n1];
        int[] r=new int[n2];

        for(int i=0;i<n1;i++){
            l[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k]=l[i];
                i++;
            }else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(i<n2){
            arr[k]=r[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] arr={78,89,45,23,54,12,90};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
