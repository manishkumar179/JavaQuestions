import java.util.Scanner;

public class Check_Vowel_Consonant {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the English Alphabet");
char alpha=sc.next().charAt(0);

if (alpha=='a' || alpha=='A' ||alpha=='E'|| alpha=='e' || alpha=='i' || alpha=='I' || alpha=='O'|| alpha=='o' || alpha=='u' || alpha=='U') {
    System.out.println("Entered alphabet is vowel");
    
}else{
    System.out.println("Entered alphabet is consonent");
}

    }
}