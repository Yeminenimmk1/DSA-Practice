package binarysearch;

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,10,12,15,18,25,29,36,37,39,45,49,58,61,100};
        System.out.println("Enter the Target: ");
        int target=sc.nextInt();
        int result=binarySearch(arr,target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid] > target){
                end=mid-1;
            }
            else if(arr[mid] < target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
