package ir.alperplus;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordConverterTestJava {

    @Test
    public void testUnit() {
        String convert = NumberToWordConverter.INSTANCE.convert("0");
        assertEquals(convert, "صفر");
    }
}
