public class String76 {

    public static void main(String[] args) {
        String s="AcgDfD";
        String ans=" ";
        int n=s.length();
       for (char ch : s.toCharArray()) {
        if(ch>='a' && ch<='z'){
            ans=ans+(char)(ch-32);

        }else{
            ans+=(char)(ch+32);
        }
        
       }
       System.out.println("After toggle = " + ans);
        
    }
    
}
