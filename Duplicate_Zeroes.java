import java.util.Arrays;

public class Duplicate_Zeroes {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,5,0};
        int n=arr.length;
        int ans[]=new int[n];
        int i=0;
        int j=0;
        while (j<n) {
            if(arr[i]!=0){
                ans[j++]=arr[i];
            }else{
                ans[j++]=0;
                ans[j++]=0;
            }
            i++;
        }
        
        System.out.println(Arrays.toString(ans));
    }
}
