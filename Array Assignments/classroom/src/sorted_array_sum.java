public class sorted_array_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Already sorted
        int sum = 8;

        for (int i = 0; i < arr.length - 1; i++) {
            int target = sum - arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            // Manual binary search using while loop
            while (left < right) {
                int mid = (left+right)/2;
                if (arr[mid] == target) {
                    System.out.println("Present");
                    return;
                } else if (arr[mid] < target) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }
        }

        System.out.println("Not Present");
    }
}
// time complexity: O(n*logn)
// space complexity: O(n)
// Auxiliary space : O(1)

