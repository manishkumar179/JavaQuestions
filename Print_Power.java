import java.util.Scanner;

public class Print_Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        
        for (int i = 1; i <=b; i++) {
            ans=ans*a;
        }
        System.out.println("Answer of " + a + "^" + b + " is " + ans);
    }
    
}
