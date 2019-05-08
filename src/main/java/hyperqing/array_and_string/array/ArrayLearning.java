package hyperqing.array_and_string.array;

public class ArrayLearning {
    /**
     * 寻找数组的中心索引
     *
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
     *
     * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     *
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     */
    public int pivotIndex(int[] nums) {
        if (nums.length <= 1) {
            return -1;
        }

        int bound; // 数组的中心索引
        for (bound = 0; bound < nums.length; bound++) {
            int front = 0;
            int end = 0;
            for (int i = 0; i < bound; i++) {
                front += nums[i];
            }
            for (int j = bound+1; j < nums.length; j++) {
                end += nums[j];
            }
            if (front == end) {
                return bound;
            }
        }
        return -1;
    }

    /**
     * 至少是其他数字两倍的最大数
     *
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     *
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     *
     * 如果是，则返回最大元素的索引，否则返回-1。
     */
    public int dominantIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        }
        return 0;
    }
}
