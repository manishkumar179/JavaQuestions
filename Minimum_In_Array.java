public class Minimum_In_Array {
    public static void main(String[] args) {
        int arr[]={1,-5,76,-79,86,-10};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
