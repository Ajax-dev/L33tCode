import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class longest_common_prefixTest {
    longest_common_prefix lcp;

    @BeforeEach
    void setUp() {
        lcp = new longest_common_prefix();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing [\"flower\",\"flow\",\"flight\"] is 'fl'")
    void isFl() {
        String str[] ={"flower", "flow", "flight"};
        Assert.assertEquals("fl", lcp.longestCommonPrefix(str));
    }
}