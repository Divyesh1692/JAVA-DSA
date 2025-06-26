public class printmax_in_all_row {
    public static void main(String[] args) {
        int[][] mat = {{1,4,3,6},{2,21,17,20},{9,3,1,27}};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<row;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<col;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
