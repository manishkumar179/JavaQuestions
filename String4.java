public class String4 {

    public static boolean ispalindrome(String s) {

        // Convert string to lower case for case sensitive comparison 
        s=s.toLowerCase();

        // Reverse the string
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        //Compare original string with reverse string
        return s.equals(rev);
    }

    public static void main(String[] args) {

        String s = "abA";
        // boolean res=ispalindrome(s);
        if (ispalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
}
