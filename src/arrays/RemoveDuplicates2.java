package arrays;
import java.util.*;
public class RemoveDuplicates2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements in the sorted or unsorted: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        removeDuplicates(arr);
    }
    static void removeDuplicates(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                list.add(arr[i]);
            }
        }
        System.out.println("unique Elements: "+set);
        System.out.println("duplicates: "+list);
    }
}
