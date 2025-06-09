public class q1 {
    public static void main(String[] args){
        int[] arr ={1,12,6,31,7,9,3,5,0};
        int d = 3;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%d==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
// time complexity: O(n)
// space complexity: O(1)