public class remove_max_from_col {
    public static void main(String[] args) {
        int[][] mat = {{1,4,3,6},{2,21,17,20},{9,3,1,27}};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<col;i++){
           int maxJ = 0;
           for(int j=0; j<row; j++){
               if(mat[j][i]>mat[maxJ][i]){
                   maxJ = j;
               }
           }
           while(maxJ<row-1){
               mat[maxJ][i] = mat[maxJ+1][i];
               maxJ++;
           }
        }
        for(int i=0; i<row-1; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
