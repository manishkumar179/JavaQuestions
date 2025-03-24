public class Max_Number_In_Array {
    public static void main(String[] args) {
        int nums[]={1,70,-24,45,234};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max=nums[i];
            }
        }
    System.out.println("Maximum value in array is :- " + max);
        
    }
    
}
