import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle");
double principle=sc.nextDouble();
System.out.println("Enter rate");
double rate=sc.nextDouble();
System.out.println("Enter time");
double time=sc.nextDouble();


double CI=principle*Math.pow((100+rate)/100, time);

System.out.println(CI);






}
    
}
