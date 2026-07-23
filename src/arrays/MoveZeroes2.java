package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count++;
            }
            else if(count > 0){
                int temp=arr[i];
                arr[i]=0;
                arr[i-count]=temp;
            }
        }
    }
}
//input
//Enter the size of the Array:
//        5
//Enter the elements in the Array:
//        0
//        1
//        0
//        30
//        12

//output
//        [1, 30, 12, 0, 0]