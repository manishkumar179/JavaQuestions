import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m , M , f, F");
        char gender=sc.next().charAt(0);
        if (gender=='m' || gender=='M') {
            System.out.println("Good morning sir");
            
        }else if (gender=='f' || gender=='F') {
            System.out.println("Good morning ma'am");
        }
    }
    
}
