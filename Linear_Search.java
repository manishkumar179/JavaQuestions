public class Linear_Search {
    public static void main(String[] args) {
        int arr[]={1,4,8,3,9};
        int key=9;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("Key Value is found at index at " + i);
            }
        }
    }
    
}
