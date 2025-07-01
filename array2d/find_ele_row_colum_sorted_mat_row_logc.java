public class find_ele_row_colum_sorted_mat_row_logc {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 10, 25, 50},
                {3, 12, 27, 60},
                {6, 15, 29, 61},
                {9, 17, 32, 68}
        };

        int k = 29;

        if (searchMatrix(mat, k)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }

    public static boolean searchMatrix(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        for(int i = 0; i<rows;i++){
            int l = 0; int r = cols-1;

            while(l<r){
                int mid = (l+r)/2;
                if(mat[i][mid]==k){
                    return true;
                }else if(mat[i][mid]<k){
                    l=mid+1;
                }else{
                    r= mid-1;
                }
            }
        }


        return false;
    }
}
// T: O(row*log(col))