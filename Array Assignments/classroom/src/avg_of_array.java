public class avg_of_array {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum = 0,avg;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.print(avg);
    }
}
// time complexity: O(n)
// space complexity: O(n)
