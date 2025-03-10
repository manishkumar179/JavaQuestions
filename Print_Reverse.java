import java.util.Scanner;

public class Print_Reverse {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();    
    int rev=0;
    while (n!=0) {

        //  reminder
        int rem=n%10;

        // reverse  or  task
        rev=rev*10+rem;


        //reduction
        n=n/10;

        
    }
    System.out.println( "Reverse of the number is:- " + rev);
}    
}
