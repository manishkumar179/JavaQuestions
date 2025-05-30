public class Arm_Strong_Number {
    public static void main(String[] args) {
        int n=1;
        int temp=n;
        int ans=0;
        while (temp!=0) {
            int rem=temp%10;
            ans+=Math.pow(rem, 3);
            temp=temp/10;   
        }
         if(ans==n){
            System.out.println("armstrong");
         }else{
            System.out.println("not");
         }
    }
}
