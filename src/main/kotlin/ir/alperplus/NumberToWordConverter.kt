package ir.alperplus

private const val STR_AND = " و "

private val UNITS = arrayOf("صفر", "یک", "دو", "سه", "چهار", "پنج", "شش", "هفت", "هشت", "نه", "ده", "یازده", "دوازده", "سیزده", "چهارده", "پانزده", "شانزده", "هفده", "هجده", "نوزده")
private val TENS = arrayOf("", "", "بیست", "سی", "چهل", "پنجاه", "شصت", "هفتاد", "هشتاد", "نود")
private val HUNDREDS = arrayOf("", "یکصد", "دویست", "سیصد", "چهارصد", "پانصد", "ششصد", "هفتصد", "هشتصد", "نهصد")
private val STEPS = arrayOf("هزار", "میلیون", "میلیارد", "بیلیون", "بیلیارد", "تریلیون", "تریلیارد")

object NumberToWordConverter {

    fun convert(i: Long): String = when {
        i < 20 -> UNITS[i.toInt()]
        i < 100 -> TENS[(i / 10).toInt()] + if (i % 10 > 0) STR_AND + convert(i % 10) else ""
        i < 1000 -> HUNDREDS[(i / 100).toInt()] + if (i % 100 > 0) STR_AND + convert(i % 100) else ""
        i < 1000000 -> convert(i / 1000) + stepsString(STEPS[0]) + if (i % 1000 > 0) STR_AND + convert(i % 1000) else ""
        i < 1000000000 -> convert(i / 1000000) + stepsString(STEPS[1]) + if (i % 1000000 > 0) STR_AND + convert(i % 1000000) else ""
        i < 1000000000000 -> convert(i / 1000000000) + stepsString(STEPS[2]) + if (i % 1000000000 > 0) STR_AND + convert(i % 1000000000) else ""
        i < 1000000000000000 -> convert(i / 1000000000000) + stepsString(STEPS[3]) + if (i % 1000000000000 > 0) STR_AND + convert(i % 1000000000000) else ""
        i < 1000000000000000000 -> convert(i / 1000000000000000) + stepsString(STEPS[4]) + if (i % 1000000000000000 > 0) STR_AND + convert(i % 1000000000000000) else ""
        else -> convert(i / 1000000000000000000) + stepsString(STEPS[5]) + if (i % 1000000000000000000 > 0) STR_AND + convert(i % 1000000000000000000) else ""
    }

    private fun stepsString(step: String) = " $step "
}
