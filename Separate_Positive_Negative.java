import java.util.Arrays;

public class Separate_Positive_Negative {
    public static void main(String[] args) {
        
        int arr[]={7,-8,4,-2,-5,9};
        int n= arr.length;
        int temp[]=new int[n];
        for (int i = 0 , j=0 ,k=n-1 ; i < n; i++) {
            if(arr[i]<0) {

                temp[j++] = arr[i];
            }
            else temp[k--]=arr[i];

        }
        System.out.println(Arrays.toString(temp));
    }
}
