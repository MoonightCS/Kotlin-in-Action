package ru.popov.bodya.safety

fun sendEmail(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    val email: String? = "bodya@google.com"
    email?.let { sendEmail(email) }
}