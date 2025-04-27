public class String3 {
    public static void main(String[] args) {
        String s="aba";
        int n =s.length();
        String rev="";
        for (int i = n-1; i >=0; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev.equals(s)? "pallindrome " : "not");
        System.out.println(s==rev? "pallindrome" : "not");

        
    }
}
