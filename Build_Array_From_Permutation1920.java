import java.util.Arrays;

public class Build_Array_From_Permutation1920 {
    public static void main(String[] args) {
        int arr[]={0,2,1,5,3,4};
        int n=arr.length;
        int ans[]=new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
