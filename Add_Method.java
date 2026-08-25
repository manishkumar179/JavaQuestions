import java.util.Scanner;

public class Add_Method {

    static int addTwoNum(int a, int b){
        int add = a+b;

        return add;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:- ");
        int x = sc.nextInt();

        System.out.println("Enter second Number:- ");
        int y = sc.nextInt();


        System.out.println(addTwoNum(x,y));


        sc.close();

    }
}
