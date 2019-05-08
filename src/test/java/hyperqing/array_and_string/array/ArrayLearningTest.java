package hyperqing.array_and_string.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLearningTest {

    @Test
    public void pivotIndex() {
        ArrayLearning arrayLearning = new ArrayLearning();
        int[] nums = {1, 7, 3, 6, 5, 6};
        Assert.assertEquals(3, arrayLearning.pivotIndex(nums));

        int[] nums2 = {-1, -1, -1, 0, 1, 1};
        Assert.assertEquals(0, arrayLearning.pivotIndex(nums2));
    }
}