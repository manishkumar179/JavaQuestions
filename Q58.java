import java.util.Arrays;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Your Entered elements are:- ");
        for (int k = 0; k < arr.length; k++) {
            arr[k]=sc.nextInt();
        }   
        int rev[]=new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            rev[j]=arr[i];
            j++;
        }
        System.out.println( " Elements after reverse:- " + Arrays.toString(rev));
    }
    
}
