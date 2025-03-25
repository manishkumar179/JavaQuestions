import java.util.Scanner;

public class Variables_Ques {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the cost of item 1:- ");
    float cost1=sc.nextFloat();
    System.out.println("Enter the cost of item 2:- ");
    float cost2=sc.nextFloat();
    System.out.println("Enter the cost of item 3:- ");
    float cost3=sc.nextFloat();
    float totalcost=cost1+cost2+cost3;
    System.out.println("Enter GST in percentage : ");
    int GST=sc.nextInt();
    float m=GST/(100*totalcost);
    

    System.out.println("Total cost of an all item :- " + (totalcost + m) 
    );

  }  
}
