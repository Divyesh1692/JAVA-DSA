import java.util.Arrays;

public class array_leetcode {
    public static void main(String[] args){
      int[] nums= {1,2,3,4,1,2,1,4,5,1,7};

   int k= majorityElement(nums);
        System.out.println(k);

    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                m = nums[i];
            }

            if (nums[i] == m) {
                count++;
            } else {
                count--;
            }
        }

        return m;
    }
}
// time complexity: O(n)
// space complexity: O(n)
