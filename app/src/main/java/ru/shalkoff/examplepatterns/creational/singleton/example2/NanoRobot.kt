package ru.shalkoff.examplepatterns.creational.singleton.example1

import android.content.Context

/**
 * Синглтон, с возможность передавать аргументы.
 */
class NanoRobot private constructor(context: Context) {

    init {
        //todo action with context
        context.theme
    }

    companion object : NanoRobotSingleton(creator = { NanoRobot(it) })
}

/**
 * Используется двойная проверка, чтобы не было проблем с памятью.
 */
open class NanoRobotSingleton(val creator: (Context) -> NanoRobot) {

    // аннотация @Volatile говорит нам, что значение переменной будет изменятся разными потоками
    @Volatile
    private var instance: NanoRobot? = null

    fun getInstance(context: Context): NanoRobot {
        val firstCheckInstance = instance
        if (firstCheckInstance != null) {
            return firstCheckInstance
        }

        return synchronized(this) {
            val secondCheckInstance = instance
            return if (secondCheckInstance != null) {
                secondCheckInstance
            } else {
                val nanoRobot = creator(context)
                instance = nanoRobot
                nanoRobot
            }
        }
    }
}