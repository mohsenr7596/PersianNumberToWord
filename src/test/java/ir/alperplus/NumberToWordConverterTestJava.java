package ir.alperplus;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordConverterTestJava {

    private static Message message;

    @BeforeClass
    public static void setup() {
        message = new Message();
    }

    @Test
    public void testUnit() {
        String convert = NumberToWordConverter.INSTANCE.convert("0");
        assertEquals(convert, message.get("numbers.zero"));
    }
}
