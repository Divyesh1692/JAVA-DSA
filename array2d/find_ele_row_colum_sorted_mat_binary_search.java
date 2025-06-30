public class find_ele_row_colum_sorted_mat_binary_search {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 10, 25, 50},
                {3, 12, 27, 60},
                {6, 15, 29, 61},
                {9, 17, 32, 68}
        };

        int k = 67;

        if (searchMatrix(mat, k)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }

    public static boolean searchMatrix(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        int i = 0;
        int j = cols - 1; // start from top-right

        while (i < rows && j >= 0) {
            if (mat[i][j] == k) {
                return true;
            } else if (mat[i][j] > k) {
                j--; // move left
            } else {
                i++; // move down
            }
        }

        return false;
    }
}
// T: O(row+col)