package day;//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9738 👎 0


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
public class day3_两数之和 {

    public static void main(String[] args) {
        int[] a = {0, 4, 3, 0};

        System.out.println(Arrays.toString(twoSum(a, 6)));
    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sum = new HashMap();
        int[] result = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {

            int number = nums[i];
            if (sum.containsKey(number)) {
                result[0] = sum.get(number);
                result[1] = i;
                return result;
            }
            int x = target - nums[i];
            sum.put(x, i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
