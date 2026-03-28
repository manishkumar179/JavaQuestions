public class GCD_HCF {
    public static void main(String[] args) {
        int a = 15;
        int b = 40;
        int gcd = 1;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0 && b%i==0){
                gcd = i;

            }
        }
        System.out.println(gcd);
    }
}
