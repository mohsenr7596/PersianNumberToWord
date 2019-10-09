package ir.alperplus

import org.junit.Assert.assertEquals
import org.junit.Test

class NumberToWordConverterTest {

    @Test
    fun testUnit() {
        val s = NumberToWordConverter.convert(1)
        assertEquals(s, "یک")
    }

    @Test
    fun testTens1() {
        val s = NumberToWordConverter.convert(10)
        assertEquals(s, "ده")
    }

    @Test
    fun testTens2() {
        val s = NumberToWordConverter.convert(11)
        assertEquals(s, "یازده")
    }

    @Test
    fun testTens3() {
        val s = NumberToWordConverter.convert(43)
        assertEquals(s, "چهل و سه")
    }

    @Test
    fun testTens4() {
        val s = NumberToWordConverter.convert(99)
        assertEquals(s, "نود و نه")
    }

    @Test
    fun testHundreds() {
        val s = NumberToWordConverter.convert(100)
        assertEquals(s, "یکصد")
    }

    @Test
    fun testHundreds2() {
        val s = NumberToWordConverter.convert(101)
        assertEquals(s, "یکصد و یک")
    }

    @Test
    fun testHundreds3() {
        val s = NumberToWordConverter.convert(111)
        assertEquals(s, "یکصد و یازده")
    }

    @Test
    fun testHundreds4() {
        val s = NumberToWordConverter.convert(123)
        assertEquals(s, "یکصد و بیست و سه")
    }
}
