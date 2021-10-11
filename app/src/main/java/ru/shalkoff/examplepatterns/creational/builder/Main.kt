package ru.shalkoff.examplepatterns.creational.builder

import ru.shalkoff.examplepatterns.creational.builder.example1.Human

class Main {

    init {
        val human = Human.HumanBuilder()
            .addBody()
            .addHands()
            .addHead()
            .addLegs()
            .build()

        val smartHumanBuilder = DirectorHuman.makeSmartHuman(Human.HumanBuilder())
        val smartHuman = smartHumanBuilder.build()

        val defaultHumanBuilder = DirectorHuman.makeDefaultHuman(Human.HumanBuilder())
        val defaultHuman = defaultHumanBuilder.build()
    }
}