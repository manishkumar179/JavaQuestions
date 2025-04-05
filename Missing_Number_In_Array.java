public class Missing_Number_In_Array {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        int ans=totalsum-sum;
        System.out.println("Missing number in array is: " +  ans);

    
}
    
}
