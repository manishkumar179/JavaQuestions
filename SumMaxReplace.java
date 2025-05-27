import java.util.Arrays;

public class SumMaxReplace {
    public static void main(String[] args) {
        int arr[]={1,3,5,3,4,5};
        int size=arr.length;
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < size; i++) {
            arr[i]=sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
