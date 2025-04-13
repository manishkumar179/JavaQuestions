public class Method_Overloading {

  public static void add1(int a , int b){
    System.out.println("Sum of a and b = " +(a+b));
  }
  
  public static void add2(int a,int b,int c){
    System.out.println("Sum of a,b and c = " + (a+b+c));
  }

    public static void main(String[] args) {
        add1(2, 4);
        add2(23, 1, 1);
    }
}
