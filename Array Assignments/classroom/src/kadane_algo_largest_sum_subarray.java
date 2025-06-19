public class kadane_algo_largest_sum_subarray {
    public static void main(String[] args){
       int [] arr = {2,4,-5,3,1,2,-6,7};

       int n = arr.length;
       int maxSum = Integer.MIN_VALUE;
       int tempSum=0;
       for(int i=0; i<n; i++){
           tempSum = tempSum+arr[i];
           if(tempSum>maxSum){
               maxSum = tempSum;
           }
           if(tempSum<0){
               tempSum=0;
           }
       }
        System.out.println(maxSum);
    }
}
// time complexity: O(n)
// space complexity: O(n)
