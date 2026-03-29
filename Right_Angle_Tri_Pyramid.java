public class Right_Angle_Tri_Pyramid {
    public static void main(String[] args) {
        int n = 5;


//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 0; i <= n ; i++) {
//            for (int j = n-1; j >= i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//

        for (int i = 1; i <= 2*n-1 ; i++) {
            int stars = i;
            if(i>n) stars = 2*n-i;
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
