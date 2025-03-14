import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter f or F or m or M");
        char gender=sc.next().charAt(0);
        if (gender=='m' || gender=='M') {
            System.out.println("Good morning sir");
            
        }else if (gender=='f' || gender=='F') {
            System.out.println("Good morning ma'am");
            
        }else{
            System.out.println("You entered a wrong input");
        }
    }
    
}
