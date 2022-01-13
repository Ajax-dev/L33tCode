import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum ts;

    @BeforeEach
    void setUp() {
        ts = new TwoSum();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing array [2,7,11,15], target 9 to return [0,1]")
    void testTwoSumEg1() {
        int[] expected = {0,1};
        int[] returnVal = ts.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(expected, returnVal);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing array [3,3], target 6 to return [0,1]")
    void testTwoSumEg2() {
        int[] expected = {0,1};
        int[] returnVal = ts.twoSum(new int[]{3,3}, 6);
        assertArrayEquals(expected, returnVal);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing array [3,2,4], target 6 to return [1,2]")
    void testTwoSumEg3() {
        int[] expected = {1,2};
        int[] returnVal = ts.twoSum(new int[]{3,2,4}, 6);
        assertArrayEquals(expected, returnVal);
    }
}