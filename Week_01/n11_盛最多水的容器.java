package org.example.week01;

public class n11_盛最多水的容器 {
    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
     * ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * <p>
     * 说明：你不能倾斜容器。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * <p>
     * <p>
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
     * <p>
     * 示例 2：
     * <p>
     * <p>
     * 输入：height = [1,1]
     * 输出：1
     * <p>
     * <p>
     * 示例 3：
     * <p>
     * <p>
     * 输入：height = [4,3,2,1,4]
     * 输出：16
     * <p>
     * <p>
     * 示例 4：
     * <p>
     * <p>
     * 输入：height = [1,2,1]
     * 输出：2
     * <p>
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * <p>
     * n = height.length
     * 2 <= n <= 3 * 104
     * 0 <= height[i] <= 3 * 104
     * <p>
     * Related Topics 数组 双指针
     * 👍 2010 👎 0
     */


    //leetcode submit region begin(Prohibit modification and deletion)
    public static void main(String[] args) {

        int[] height_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] height_2 = {9, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] height_3 = {9, 2, 3, 4, 9, 6, 7, 8, 9};

        int[] height_4 = {9, 9, 9, 9, 9, 9, 9, 9, 9};

        System.out.println(maxArea(height_1));
        System.out.println(maxArea(height_2));
        System.out.println(maxArea(height_3));
        System.out.println(maxArea(height_4));
        System.out.println(maxArea02(height_1));
        System.out.println(maxArea02(height_2));
        System.out.println(maxArea02(height_3));
        System.out.println(maxArea02(height_4));

    }

    // 逻辑清晰、简单的标准解法
    public static int maxArea(int[] height) {
        // 设置 数组指针 i , j , 结果 res
        int i = 0, j = height.length - 1, res = 0;

        // 通过 最大值与最小值 结果计算，不断的向数组中心靠拢 得出数组中最大 的一组大小赋值给结果集，最终返回
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }

        // 返回
        return res;
    }

    // 优化上述简单逻辑、从内存上考虑更小占用的调用(后面证明，心理作用， T_T )
    public static int maxArea02(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int i = 0, j = height.length - 1, res = 0;

        while (i < j) {
            int min = height[i] < height[j] ? height[i++] : height[j--];
            res = Math.max(res, min * (j - i + 1));
        }

        return res;
    }

//leetcode submit region end(Prohibit modification and deletion)


}
