public class Binary_Search_Recursion {


public static int binary(int arr[] , int key , int st, int end){
    while (st<=end) {
        int mid=st+(end-st)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            end=mid-1;
        }else{
            st=mid+1;
        }
    }
    return -1;

}

    public static void main(String[] args) {

        int arr[]={-1,2,4,6,12,44};
        int n=arr.length;
        int result=binary(arr,4,0,n-1);

        if(result==-1){
            System.out.println("Element are not present in array ");
        }else{
            System.out.println("Element are found at index: " + result);
        }
        











    }
}
