public class Search_Insert_Position {

public static int search(int nums[] , int target){
    int st=0,end=nums.length-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            end=mid-1;
        }else{
            st=mid+1;
        }
    }

     return st;
}


    public static void main(String[] args) {
        int nums[]={1,2,4,5};
        int target=3;
        System.out.println(search(nums, target));

    }
}
