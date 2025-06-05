import java.util.Arrays;

public class Separate_Zero_and_One {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 1, 0, 1 };
        int n = arr.length;
        int nums[] = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                nums[j--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
