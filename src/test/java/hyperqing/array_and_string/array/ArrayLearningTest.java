package hyperqing.array_and_string.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLearningTest {

    @Test
    public void pivotIndex() {
        ArrayLearning arrayLearning = new ArrayLearning();
        int[] nums = {1, 7, 3, 6, 5, 6};
        Assert.assertEquals(3, arrayLearning.pivotIndex(nums));

        int[] nums2 = {-1, -1, -1, 0, 1, 1};
        Assert.assertEquals(0, arrayLearning.pivotIndex(nums2));
    }

    @Test
    public void dominantIndex() {
        ArrayLearning arrayLearning = new ArrayLearning();
        int[] nums = {3, 6, 1, 0};
        Assert.assertEquals(1, arrayLearning.dominantIndex(nums));
        int[] nums2 = {0, 0, 3, 2};
        Assert.assertEquals(-1, arrayLearning.dominantIndex(nums2));
    }

    @Test
    public void plusOne() {
        ArrayLearning arrayLearning = new ArrayLearning();
        int[] nums = {1, 2, 3};
        int[] exceptedNum = {1, 2, 4};
        Assert.assertArrayEquals(exceptedNum, arrayLearning.plusOne(nums));
        int[] nums2 = {4, 3, 2, 1};
        int[] exceptedNum2 = {4, 3, 2, 2};
        Assert.assertArrayEquals(exceptedNum2, arrayLearning.plusOne(nums2));

        int[] nums3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        arrayLearning.plusOne(nums3);
    }
}