# PersianNumberToWord
Number2Word

This app can use in **Android** and **Java(or Kotlin)** app to convert numbers to persian word like

`1 -> یک`

`10 -> ده`


Example use in java

`String converted = NumberToWordConverter.convert("0")
// print صفر`

Example use in kotlin

`val s = NumberToWordConverter.convert(123)
// print یکصد و بیست و سه`

If number higher than max long support (9223372036854775807) you can use String format like :

`String convert = NumberToWordConverter.convert("10000000000000000000");

assertEquals(convert, "ده تریلیون ");`
