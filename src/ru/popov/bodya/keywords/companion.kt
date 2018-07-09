class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User("Bodya$accountId")
    }
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class JsonPerson(val name: String) {
    companion object : JSONFactory<JsonPerson> {
        override fun fromJSON(jsonText: String): JsonPerson = JsonPerson(jsonText)
    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>) = factory.fromJSON("Hello")

fun main(args: Array<String>) {
    A.bar()
    println(User.newSubscribingUser("popovbodya@google.com").nickname)
    println(User.newFacebookUser(9).nickname)
    println(loadFromJSON(JsonPerson).name)
}