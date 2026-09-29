package BasicMath;

public class Perfect_Number {


//    Optimized
    static  boolean perfectNumber(int num){
        int sum = 1;
        for (int i = 2; i*i <= num ; i++) {
            if(num % i == 0){
                int firstFactor = i;
                int secondFactor = num/i;

                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

//        Brute force approach
        /*
        int n = 6;
        int sum = 0;

        for (int i = 1; i <= n-1; i++) {
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(n == sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not perfect");
        }
        */


        System.out.println(perfectNumber(6));



    }
}
