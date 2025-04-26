import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {


        //print reverse of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
