public class find_ele_row_colum_sorted_mat_logr_logc {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5,10},
                {12,15,17,20},
                {24,25,29,31},
                {39,40,42,48}
        };

        int k = 17;

        if (searchMatrix(mat, k)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }

    public static boolean searchMatrix(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        int t = 0, b=rows-1;

       while(t<b){
           int m = (t+b)/2;

           if(mat[m][0]==k) {
               return true;
           }else if(mat[m][0]<k){
               t = m+1;
           }else{
               b=m-1;
           }

            int l = 0; int r = cols-1;

            while(l<r){
                int mid = (l+r)/2;
                if(mat[m][mid]==k){
                    return true;
                }else if(mat[m][mid]<k){
                    l=mid+1;
                }else{
                    r= mid-1;
                }
            }
        }


        return false;
    }
}
// T: O(log(row)+log(col))