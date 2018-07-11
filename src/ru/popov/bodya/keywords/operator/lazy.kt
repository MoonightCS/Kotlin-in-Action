package ru.popov.bodya.keywords.operator

private class User(val name: String, val id: Long) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

    val delegatedEmails by lazy { loadEmails(this) }

}

private data class Email(val inbox: String)

private fun loadEmails(user: User): List<Email> {
    println("Load emails for ${user.name}")
    return listOf(Email("yandex"), Email("gmail"), Email("mail"))
}

fun main(args: Array<String>) {
    val user = User("Maryana", 9)
    println(user.emails)
    println(user.delegatedEmails)
    println(user.delegatedEmails)
}