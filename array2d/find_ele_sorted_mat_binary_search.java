public class find_ele_sorted_mat_binary_search {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 3, 5, 7},
                {9, 11, 13, 15},
                {17, 19, 21, 23},
                {25, 28, 60, 80}
        };

        int target = 83;
        if (searchSortedMatrix(mat, target)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }

    public static boolean searchSortedMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midValue = mat[mid / cols][mid % cols];

            if (midValue == target) return true;
            else if (midValue < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
// T: O(log(row*col))