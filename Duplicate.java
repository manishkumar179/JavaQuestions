public class Duplicate {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int count=1;
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(count==0){
            ans=arr[i];
           }else if(ans==arr[i]){
            count++;
           }else{
            count--;
           }
            
        }
        System.out.println(ans);
    }
    
}
