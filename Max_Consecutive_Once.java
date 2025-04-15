public class Max_Consecutive_Once {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1};
        int count=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }else{
                max=Math.max(count,max);
                count=0;
            }
             max=Math.max(max, count);
        }
        System.out.println("Maximum consecutive once are: " + max);
    }
}
