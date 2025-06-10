public class odd_even {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Odd: ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]);
            }
        }
        System.out.print("\nEven: ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }
    }
}
// time complexity: O(n)
// space complexity: O(n)
