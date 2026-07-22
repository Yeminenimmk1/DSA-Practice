package arrays;
import java.util.*;
public class Solution1752 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements in the Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result=cheak(arr);
        System.out.println(result);
    }
    static boolean cheak(int[] nums){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
}
