package ru.shalkoff.examplepatterns.creational.builder

class Main {

    init {
        val human = Human.HumanBuilder()
            .addBody()
            .addHands()
            .addHead()
            .addLegs()
            .build()
    }
}