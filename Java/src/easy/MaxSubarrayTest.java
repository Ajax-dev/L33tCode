package easy;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class MaxSubarrayTest {
    MaxSubarray m;

    @BeforeEach
    void setUp() {
        m = new MaxSubarray();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing max subarray of array length 1")
    void isOne() {
        int i[] = {1};
        Assert.assertEquals(1, m.maxSubArray(i));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing for 6")
    void isSix() {
        int i[] = {-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(6, m.maxSubArray(i));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing for 23")
    void is23() {
        int i[] = {5,4,-1,7,8};
        Assert.assertEquals(23, m.maxSubArray(i));
    }
}
