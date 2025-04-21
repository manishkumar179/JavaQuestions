public class CountOf_SubArrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int target = 12;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
