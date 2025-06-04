public class Duplicate01 {




    public static boolean dupli(int []nums){
       int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
       // int n=nums.length;
       System.out.println(dupli(nums));








    }
}
