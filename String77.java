public class String77 {
    public static void main(String[] args) {
        String [] arr={"payment" , "attend" , "attention" , "pay" , "atlas"};
        String pref="at";
        int c=0;
        for (String s : arr) {
            if(s.indexOf(pref)==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
