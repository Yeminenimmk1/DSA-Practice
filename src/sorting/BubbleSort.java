package sorting;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={4,3,5,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
