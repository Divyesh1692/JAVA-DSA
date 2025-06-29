public class remove_max_from_row {
    public static void main(String[] args) {
        int[][] mat = {{1,4,3,6},{2,21,17,20},{9,3,1,27}};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<row;i++){
           int maxI = 0;
           for(int j=0; j<col; j++){
               if(mat[i][j]>mat[i][maxI]){
                   maxI = i;
               }
           }
           while(maxI<col-1){
               mat[i][maxI] = mat[i][maxI+1];
               maxI++;
           }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col-1; j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
