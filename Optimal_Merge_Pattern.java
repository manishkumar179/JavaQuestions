public class Optimal_Merge_Pattern {
    static int sortarr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }
     return 0;
       
        
    }


          static  int omp(int files[], int n){

            int totalcost=0;
               for (int i = 0; n>1; n--) {
                 sortarr(files, n);
                int merged=files[0]+files[1];
                totalcost=totalcost+merged;
                files[0]=merged;
               
                for (int j = 1; j < n-1; j++) {
                    files[j]=files[j+1];
                    
                }
                
               }
                return totalcost;

            }
        
            
    

    public static void main(String[] args) {
        int files[] = { 25, 20, 10, 5 };
        int n = files.length;
        System.out.println("Size of an array : " + n);
        
        sortarr(files, n);

        int cost = omp(files, n);
        System.out.println("Minimum cost is: " + cost);

    }
}

