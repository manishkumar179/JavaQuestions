public class Automorphic_Number {
    
public static void main(String[] args) {
    
    int n=625;
    int c=0;
    int sqrt=n*n;
    int dup=n;
    while (n!=0) {
        c++;
        n=n/10;
    }
    int ans=sqrt%(int)Math.pow(10, c);
    System.out.println(ans==dup ? "Automorphic Number" : "Not Automorphic Number");
}
}
