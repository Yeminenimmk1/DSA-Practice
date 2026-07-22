package arrays;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements in the sorted: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("output: "+removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
