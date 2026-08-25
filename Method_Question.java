public class Method_Question {

//    Even ?
    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

//    MaxNumber
    static  int maxNumber(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }


    public static void main(String[] args) {

        boolean ans = isEven(10);
        int max = maxNumber(15,6);
        System.out.println(max);
        System.out.println(ans);


    }
}
