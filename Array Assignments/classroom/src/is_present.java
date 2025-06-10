public class is_present {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k=5;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k){
                System.out.print("Present");
                return;
            }
        }
        System.out.print("Not Present");
    }
}
// time complexity: O(n)
// space complexity: O(n)

