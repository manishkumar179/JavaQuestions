
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println(" Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
int greatest=a;
        if(b>greatest){
            greatest=b;
        }
        if(c>greatest){
            greatest=c;
        }
        System.out.println("The greatest number is " + greatest);




    }
}
