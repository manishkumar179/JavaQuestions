public class Check_Prime {
    public static void main(String[] args) {
    int n=11;
    int count=0;
    for (int i = 1; i <=n; i++) {
        if (n%i==0) {
            count++;
            
        }
    }
    System.out.println(count==2 ? "prime" : "Not prime");
            
            }
        }

    

