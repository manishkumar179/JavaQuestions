public class Binary_Search {
    public static void main(String[] args) {
        int arr[]={1,4,7,9};
        int search=7;
        int st=0;
        int end=arr.length-1;


        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==search){
                System.out.println("Value find at index " + mid);
                break;
            } if (arr[mid]<search){
                st=mid+1;

            }else {
                end=mid-1;
            }

        }
    }
    
}
