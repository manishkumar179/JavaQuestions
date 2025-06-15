public class Graph_Representation_matrix {
    static  void graphbymatix(int u,int v,int[][]arr,boolean isDirected){
        if (isDirected){
            arr[u][v]=1;
        }else {
            arr[u][v]=1;
            arr[v][u]=1;
        }
    }
    public static void main(String[] args) {
        int v=6;
        int arr[][]=new int[6][6];
        System.out.println("Adjacency Matix:- ");

        graphbymatix(0,1,arr,false);
        graphbymatix(0,3,arr,false);
        graphbymatix(1,2,arr,false);
        graphbymatix(1,3,arr,false);
        graphbymatix(3,4,arr,false);
        graphbymatix(4,2,arr,false);
        graphbymatix(4,5,arr,false);
        graphbymatix(1,5,arr,false);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
