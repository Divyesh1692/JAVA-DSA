public class count_even_odd {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int oddCount = 0, evenCount = 0;
        for (int i=0; i<arr.length;i++) {
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);;
    }
}
// time complexity: O(n)
// space complexity: O(1)
