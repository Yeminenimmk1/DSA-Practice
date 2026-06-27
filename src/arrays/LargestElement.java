package arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] arr={4,10,1,6,12,5,8,45,62,78,99,412,100,22,32,56,69,41};
        int result=getLargest(arr);
        System.out.println(result);
    }
    static int getLargest(int[] arr){
        int lar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
