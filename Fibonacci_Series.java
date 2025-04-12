public class Fibonacci_Series {


        public static int fab(int n){
            if(n<=1){
                return n;
            }else{
                return fab(n-1)+fab(n-2);
            }
        }

    public static void main(String[] args) {
        
        int result = fab(5);
        for (int i = 0; i <= result; i++) {
            System.out.println(fab(i));
        }

    }
}
