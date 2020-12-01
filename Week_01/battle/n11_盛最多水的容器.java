package battle;

/**
 * 实战题目 双指针
 */
public class n11_盛最多水的容器 {

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
