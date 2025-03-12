import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        Scanner sc= new Scanner(System.in);
        int ch;

        do{

        System.out.println("Welcome to calculator:- ");
        System.out.println("1- Addition \n2- Product \n0:- Exit");
         ch=sc.nextInt();

        if (ch==1) {
            
        System.out.println("Addition");
        System.out.println(a+b);
        }
        else if (ch==2) {
            
        System.out.println("Product");
        System.out.println(a*b);
  
        }else if (ch==0) {
            break;
            
        }
        System.out.println("Enter  1  to repeat : ");
        ch = sc.nextInt();            
        }while(ch==1);

        System.out.println("PAPPU PASS HO GYA");

        }
        
    }
    

