import java.util.Arrays;

public class Concatenation_Of_Array_1929 {

    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int ans[]=new int[n*2];
        for (int i = 0; i <n; i++) {
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        System.out.println("After concatenation of array = " + Arrays.toString(ans));
    }
}
