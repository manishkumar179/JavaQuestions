public class Pair_Of_Arrays_Element_Recursion {

     static int pair(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
             System.out.print("( " + arr[i]  + " , " + arr[j] + " ) \t " );
            }
            System.out.println();
        }
        return 0;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        pair(arr);
    }
}
