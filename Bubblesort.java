import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of an array: ");
        int size=sc.nextInt();
        int a[]= new int[size];
        System.out.println(" Enter the elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            
        }
        for (int i = 0; i < a.length; i++) {
            
        
        System.out.println(" Your entered elements are: " + a[i]);
        
    }

// bubble sort

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    
                    // swaping of element

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    
                }
                
            }
            
        }

System.out.println(Arrays.toString( a ));









    }
}
