public class printmax_in_all_cols {
    public static void main(String[] args) {
        int[][] mat = {{1,4,3,6},{2,21,17,20},{9,3,1,27}};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<col;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<row;j++){
                if(mat[j][i]>max){
                    max=mat[j][i];
                }
            }
            System.out.print(max+" ");
        }
    }
}


