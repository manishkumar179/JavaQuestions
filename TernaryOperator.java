public class TernaryOperator {
    public static void main(String[] args) {
        int x = 5;

        int result = x++ > 5 ? x++ > 6 ? ++x : x-- : ++x > 6 ? x++ : --x;

        System.out.println(result);
        System.out.println(x);
    }
}
