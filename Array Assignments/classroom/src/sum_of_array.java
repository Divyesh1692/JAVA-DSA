public class sum_of_array {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
// time complexity: O(n)
// space complexity: O(n)
