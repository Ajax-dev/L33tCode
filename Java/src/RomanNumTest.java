import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumTest {
    RomanNum rom;

    @BeforeEach
    void setUp() {
        rom = new RomanNum();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing III is 3")
    void is3() {
        Assert.assertEquals(3, rom.romanToInt("III"));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing IV is 4")
    void is4() {
        Assert.assertEquals(4, rom.romanToInt("IV"));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing IV is 9, then testing IIIIIIIII is 9")
    void is9() {
        Assert.assertEquals(9, rom.romanToInt("IX"));
        Assert.assertEquals(9, rom.romanToInt("IIIIIIIII"));

    }

}