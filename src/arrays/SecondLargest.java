package arrays;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int[] arr={1,2,4,6,3,41,25,32,12,54,24,19,34,26,54,25,65,45,21,135};
        int result=findSecondLargest(arr);
        System.out.println(result);

    }
    public static int findSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] >secondLargest && arr[i] !=largest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}
