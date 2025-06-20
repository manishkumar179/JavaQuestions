import java.util.Scanner;

public class Missing_Number_IN_SERIES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n=arr.length;
        System.out.println("Enter the elements of an array: ");
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        arr[0]=2;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]*2;
        }
        System.out.println("Series are: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println("Missing number is " + arr[n-1]);
    }
}
