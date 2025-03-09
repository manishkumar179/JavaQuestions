public class Sumof_Each_Digit {
    public static void main(String[] args) {
        int n=936;
        int sum=0;
        while (n!=0) {

            // reminder
            int rem=n%10;

            // summation
            sum=sum+rem;

            // reduction
            n=n/10;
            
        }
        System.out.println("Sum of each digit of n is : " + (sum)); 


    }
    
}
