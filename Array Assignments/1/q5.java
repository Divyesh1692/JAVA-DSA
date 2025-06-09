public class q5 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args){
        int[] arr = {4, 3, 6, 7, 21, 11, 15, 5};
        for (int k : arr) {
            if (isPrime(k)) {
                System.out.print(k + " ");
            }
        }
    }
}
// time complexity: O(n)
// space complexity: O(1)
