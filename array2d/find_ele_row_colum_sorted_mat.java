public class find_ele_row_colum_sorted_mat {
    public static void main(String[] args) {
        int [][]mat = { {1,10,25,50},
                        {3,12,27,60},
                        {6,15,29,61},
                        {9,17,32,68}
                        };
        int row= mat.length-1; int col = mat[0].length-1;
        int k=67;

        if(k>mat[row][col]) {
            System.out.println("Not present");
            return;
        }

        for(int j=0; j<=col;j++){
            if(mat[0][j]>k){
                col = j-1;
                break;
            }
        }
        for(int i =0; i<=row; i++){
            if(mat[i][col]==k){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
// T: O(row+col)