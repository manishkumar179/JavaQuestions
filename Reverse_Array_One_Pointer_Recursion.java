import java.util.Arrays;

public class Reverse_Array_One_Pointer_Recursion {

    static  void reverseArr(int []arr , int i , int n){
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArr(arr , i+1 , n);
    }

    public static void main(String[] args) {
        int i = 0;
        int arr[] = {1,2,3,4};
        int n =arr.length;
        reverseArr(arr , i , n);
        System.out.println(Arrays.toString(arr));
    }
}
