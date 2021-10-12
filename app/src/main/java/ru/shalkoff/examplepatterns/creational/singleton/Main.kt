package ru.shalkoff.examplepatterns.creational.singleton

import android.content.Context
import ru.shalkoff.examplepatterns.creational.singleton.example1.NanoRobot
import ru.shalkoff.examplepatterns.creational.singleton.example1.Robot

class Main(context: Context) {

    init {
        Robot.iamRobot()
        NanoRobot.getInstance(context)
    }
}