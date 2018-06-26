package ru.popov.bodya.hierarchy

internal open class TalkativeButton {
    internal fun yell() = println("Hey!")
    internal fun whisper() = println("Let's talk!")
}

/**
 * public - доступен повсюду
 * internal - доступен только в модуле
 * protected - доступен в подклассах
 * private - доступен в классе
 */
private fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}