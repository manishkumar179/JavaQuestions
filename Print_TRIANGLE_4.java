public class Print_TRIANGLE_4 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
