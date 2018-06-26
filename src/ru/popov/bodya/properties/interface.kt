package ru.popov.bodya.properties

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore("@")
}

class FacebookUser(accountId: Int) : User {
    override val nickname = "Bodya" + accountId
}

fun main(args: Array<String>) {
    val email = "bodyakotlin@gmail.com";
    println(PrivateUser(email).nickname)
    println(SubscribingUser(email).nickname)
    println(FacebookUser(0).nickname)
}

