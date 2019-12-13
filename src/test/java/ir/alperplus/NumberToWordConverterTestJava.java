package ir.alperplus;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordConverterTestJava {

    @Test
    public void testUnit() {
        String convert = NumberToWordConverter.convert("0");
        assertEquals(convert, "صفر");
    }

    @Test
    public void testHugeNumber() {
        String convert = NumberToWordConverter.convert("10000000000000000000");
        assertEquals(convert, "ده تریلیون ");
    }
}
