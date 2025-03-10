import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while (n!=0) {

            //reminder
            int rem=n%10;

            //task
            rev=rev*10+rem;

            //reduction
            n=n/10;
            
        }
        System.out.println(temp==rev ? "Pallindrome" : "Not pallindrome");
    }
    
}
