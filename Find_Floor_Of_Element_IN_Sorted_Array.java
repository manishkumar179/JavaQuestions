public class Find_Floor_Of_Element_IN_Sorted_Array {

public static int findfloor(int arr[] , int target){
    int n=arr.length;
       int st=0;
        int end=n-1;
        int floor=-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(arr[mid]==target){ 
                return mid; 
            }else if(arr[mid]<target){
                floor=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }

        }
        return floor;

}

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        //int target = 7;
        int result=findfloor(arr,9);
        if(result==-1){
            System.out.println("not found");
        }else{
            System.out.println(result);
        }
        

    }
}
