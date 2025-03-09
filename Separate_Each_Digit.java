import java.util.Scanner;

public class Separate_Each_Digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        while (n!=0) {

            //reminder

            int rem=n%10;
            System.out.println(rem);

            //reduction

         n/=10;   
        }

    }
    
}
