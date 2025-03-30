public class Check_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {
        int arr[]={-1,4,7,-34};
        boolean isSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted ? "Increasing Order" : "Not in Increasing order");
    }
    
}
