public class maxReplace {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,56,77};
        int size=arr.length;
        int max=arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // for (int i = 0; i < size; i++) {
        //     arr[i]=max;
        // }
        for (int i = 0; i < size; i++) {
            System.out.println(max);
        }
    }
}
