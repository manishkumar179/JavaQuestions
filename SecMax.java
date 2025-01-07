public class SecMax {
    public static void main(String[] args) {
        
int arr[]= {3,34,-45,145,-56 };

int max=Integer.MIN_VALUE;
int secMax=Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i]>max) {
        secMax=max;
        max=arr[i];
        
    }else if( arr[i]>secMax && arr[i]>max){
        secMax=arr[i];
    }
    
}


System.out.println( "SecMax value is : " + secMax);










    }
}
