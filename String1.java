import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {


        //print each char in nextline
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int n=s.length();
        for (int i = 0; i <n-1; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
