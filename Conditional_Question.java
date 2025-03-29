import java.util.Scanner;

public class Conditional_Question {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Positive Numbers");
        }else{
            System.out.println("Negative Numbers");
        }
    }
    
}
