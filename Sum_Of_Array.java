public class Sum_Of_Array {


static int sum(int arr[] , int n){
   if(n==0){
   return arr[n];
   }else{
   return arr[n]+sum(arr,n-1);
   }
}

    public static void main(String[] args) {
        // int arr[]={1,3,6,4};
        // int n=arr.length;
        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);
        
        int arr[]={1,2,3,5};
        int n=arr.length;
        int ans=sum(arr,n);
        System.out.println(ans);





    }
    
}
