public class q4 {
    public static void main(String[] args){
        int[] arr ={1,1,1,1};
        int n = arr.length,d=1,count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==d){
                count++;
            }
        }
        System.out.print("count: "+count);

    }
}
// time complexity: O(n)
// space complexity: O(1)
