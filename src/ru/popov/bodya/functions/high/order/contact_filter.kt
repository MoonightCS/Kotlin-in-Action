package ru.popov.bodya.functions.high.order

private data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)

private class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix: (Person) -> Boolean = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix
        }
        return { it: Person -> startsWithPrefix(it) && it.phoneNumber != null }
    }
}

fun main(args: Array<String>) {
    val contacts = listOf(Person("Bodya", "Popov", "123"),
            Person("Maryana", "Popova", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Bo"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}