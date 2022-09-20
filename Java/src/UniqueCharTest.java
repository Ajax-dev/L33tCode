import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class UniqueCharTest {
    UniqueChar uni;

    @BeforeEach
    void setUp() {
        uni = new UniqueChar();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns index 0")
    void test1() { Assert.assertEquals(0, uni.firstUniqChar("leetcode"));}

    @org.junit.jupiter.api.Test
    @DisplayName("loveleetcode returns index 2")
    void test2() { Assert.assertEquals(2, uni.firstUniqChar("loveleetcode"));}

    @org.junit.jupiter.api.Test
    @DisplayName("aaabbbb returns index -1")
    void test3() { Assert.assertEquals(-1, uni.firstUniqChar("aaabbbb"));}

}