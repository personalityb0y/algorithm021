package day;

import java.util.Arrays;

/**
 * 【day 2】
 */
public class day2_n66_加一 {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};

        int [] b = {9,9,8,9,9,9,9};

        System.out.println(Arrays.toString(plusOne(a)));
        System.out.println(Arrays.toString(plusOne(b)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        if (digits[0] == 0) {
            int[] array = new int[digits.length + 1];
            array[1] = 1;
            return array;
        }
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
