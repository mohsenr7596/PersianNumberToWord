package ir.alperplus

import java.util.*


class Message @JvmOverloads constructor(
    baseName: String = "message",
    language: String = "fa"
) : Map<String, String> {
    private val messages = ResourceBundle.getBundle(baseName, Locale(language))

    override val entries: Set<Map.Entry<String, String>>
        get() = throw NotImplementedError()
    override val keys: Set<String>
        get() = messages.keySet()
    override val size: Int
        get() = messages.keySet().size
    override val values: Collection<String>
        get() = throw NotImplementedError()

    override fun containsKey(key: String): Boolean {
        return messages.containsKey(key)
    }

    override fun containsValue(value: String): Boolean {
        throw NotImplementedError()
    }

    override fun get(key: String): String {
        return messages.getString(key)
    }

    override fun isEmpty(): Boolean {
        return messages.keySet().isEmpty()
    }
}
