public class Strong_Number_ByMethod {



    public static boolean issum(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + fact(digit);
            num = num / 10;
        }
        return sum == temp;
    }


    public static int fact(int n) {
        if (n==0 || n == 1){
            return 1;
        }else {
            return n * fact(n - 1);
        }
    }

    
    

    public static void main(String[] args) {
        int num=145;
         issum(num);
        if (issum(num)) {
            System.out.println(num +  " is a strong number");
        } else {
            System.out.println(num + " is Not a strong number");
        }
    }
}
