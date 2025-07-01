public class sum_of_shortest_path {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 5, 0},
                {3, 2, 7, 6},
                {6, 1, 9, 6},
                {9, 7, 3, 8}
        };

        int row = mat.length; int col = mat[0].length;
        for(int j = 1; j<row; j++){
            mat[0][j]+= mat[0][j-1];
        }
        for(int i=1; i<row; i++){
            mat[i][0]+= mat[i-1][0];
        }

        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                mat[i][j]+= Math.min(mat[i][j-1],mat[i-1][j]);
            }
        }
        System.out.println(mat[row-1][col-1]);

    }


}
// T: O(row*col)