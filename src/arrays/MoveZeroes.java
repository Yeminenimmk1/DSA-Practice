package arrays;

import java.util.*;

public class MoveZeroes {
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
    static void moveZeroes(int[] nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[k]=0;
            k++;
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