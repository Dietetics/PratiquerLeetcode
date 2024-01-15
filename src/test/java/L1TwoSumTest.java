// import pour les tests
import org.junit.Test;

// import mes deux versions
import ressources.L1TwoSum;
import maVersion.L1TwoSumMy;

// import pour assert (comparaison)
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class L1TwoSumTest {

    @Test
    public void testTwoSum() {
        L1TwoSum l1TwoSum = new L1TwoSum();

        // cas dun tableau vide
        int[] nums0 = {};
        int target0 = 9;
        int[] expected0 = {};
        assertArrayEquals(expected0, l1TwoSum.twoSum(nums0, target0));

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, l1TwoSum.twoSum(nums1, target1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1,2};
        assertArrayEquals(expected2, l1TwoSum.twoSum(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, l1TwoSum.twoSum(nums3, target3));
    }


    @Test
    public void testTwoSumMy() {
        L1TwoSumMy l1TwoSum = new L1TwoSumMy();

        int[] nums0 = {};
        int target0 = 9;
        int[] expected0 = {};
        assertArrayEquals(expected0, l1TwoSum.twoSum(nums0, target0));

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, l1TwoSum.twoSum(nums1, target1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1,2};
        assertArrayEquals(expected2, l1TwoSum.twoSum(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, l1TwoSum.twoSum(nums3, target3));

    }
}
