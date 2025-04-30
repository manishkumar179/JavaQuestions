public class String5 {
    public static void main(String[] args) {
        String s="anesM";
        s=s.toLowerCase();
        int vowel=0;
        int consonant=0;
        for (int i = 0; i < s.length(); i++) {
            char n=s.charAt(i);
            if(n=='a' || n=='e'|| n=='i' ||n=='o' || n=='u' ){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println("vowel = " + vowel);
        System.out.println("Consonant = " + consonant);
    }
}
