public class remaining_ele {
    public static void main(String[] args){
        int[] arr = {1,5,2,3,6};
        int n = 6;
        int sum = (n*(n+1))/2;
        int sum2=0;
        for(int i=0; i<arr.length; i++){
            sum2 += arr[i];
        }

        System.out.print(sum-sum2);

    }
}
// time complexity: O(n)
// space complexity: O(1)
