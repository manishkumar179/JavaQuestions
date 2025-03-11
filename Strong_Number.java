public class Strong_Number {
    public static void main(String[] args) {
        int n=145;
        int sum=0;
        while (n!=0) {

            //reminder
            int rem=n%10;

            //task
            int fact=1;
            for (int i = 1; i<=rem; i++) {
                 fact=fact*i;
                
            }
            //sum
            sum=sum+fact;
            n=n/10;
        }
        System.out.println(sum);
    }
}
