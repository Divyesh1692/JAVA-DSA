public class q2 {
    public static void main(String[] args){
        int[] arr ={1,5,7,10,9};
        int n = arr.length;
        int count =0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) {
                count++;
                break;
            }
        }
        if(count>0){
            System.out.print("Not in increasing order");
        }else{
            System.out.print("In Increasing Order");
        }
    }
}
// time complexity: O(n)
// space complexity: O(1)
