import java.util.Scanner;

public class Summation_Even_Odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int evensum=0,oddsum=0;
        for (int i = 0; i <=n; i++) {
            if (i%2==0) {
                evensum+=i;
            }else{
                oddsum+=i;
            }
            }
            System.out.println("Sum of even number up to " + n + " : " + evensum +
             " \nSum of odd number up to " + n + " : " + oddsum);          
        }
    }

