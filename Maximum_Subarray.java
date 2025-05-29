import java.util.Arrays;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};

        int n=arr.length;
        int sum=0 , max=arr[0];
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
           
        }
        System.out.println(max);

    }
}
