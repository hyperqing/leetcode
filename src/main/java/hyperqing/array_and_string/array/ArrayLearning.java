package hyperqing.array_and_string.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLearning {
    /**
     * 寻找数组的中心索引
     * <p>
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
     * <p>
     * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * <p>
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
            for (int j = bound + 1; j < nums.length; j++) {
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
     * <p>
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * <p>
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * <p>
     * 如果是，则返回最大元素的索引，否则返回-1。
     */
    public int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int firstMaxNum = -1;
        int secondMaxNum = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > firstMaxNum) {
                maxIndex = i;
                secondMaxNum = firstMaxNum;
                firstMaxNum = nums[i];
            } else if (nums[i] > secondMaxNum) {
                secondMaxNum = nums[i];
            }
        }
        return firstMaxNum >= secondMaxNum * 2 ? maxIndex : -1;
    }

    /**
     * 加一
     * <p>
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * <p>
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
     * <p>
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public int[] plusOne(int[] digits) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            integerList.add(0, digit);
        }
        int jinwei = 1;
        for (int i = 0; i < integerList.size(); i++) {
            int num = integerList.get(i);
            if (jinwei == 1) {
                if (num == 9) {
                    num = 0;
                } else {
                    num++;
                }
                integerList.set(i, num);
                if (num == 0) {
                    jinwei = 1;
                } else {
                    jinwei = 0;
                }
            }
        }
        if (jinwei == 1) {
            integerList.add(1);
        }

        Iterator<Integer> integerIterator = integerList.iterator();
        int[] result = new int[integerList.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = integerIterator.next();
        }
        return result;
    }
}
