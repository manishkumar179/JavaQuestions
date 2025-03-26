import java.util.Arrays;

public class Sum_of_two_Array {
       public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int arr1[]={1,2,3,4};
        int arr2[]=new int[arr.length];
        
        if (arr.length==arr1.length) {
            
        
        for (int i = 0,j=0,k=0; i < arr.length; i++,j++,k++) {
             
                  arr2[k]=arr[i]+arr1[j];
            
                }
                System.out.println(Arrays.toString(arr2));
                }else{
                    System.out.println("Size of array is not same");
                }
                      
                
    
}
    
}
