public class Sec_Min {
    public static void main(String[] args) {
        int arr[]={8,-5,7,9,2};
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }else if(arr[i]<secMin&& arr[i]<min){
                secMin=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(secMin);
    }
}
