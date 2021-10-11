package ru.shalkoff.examplepatterns.creational.builder

import ru.shalkoff.examplepatterns.creational.builder.example1.Human

/**
 *
 * Класс который имеет готовые реализации человека
 * (это по сути Director, который определяет как будет строится объект)
 */
object DirectorHuman {

    /**
     * Получить билдер умного человека
     */
    fun makeSmartHuman(builder: Human.HumanBuilder): Human.HumanBuilder {
        return builder
            .addHead()
            .addBody()
            .addHands()
            .addLegs()
            .addMind()
    }

    /**
     * Получить билдер обычного человека
     */
    fun makeDefaultHuman(builder: Human.HumanBuilder): Human.HumanBuilder {
        return builder
            .addHead()
            .addBody()
            .addHands()
            .addLegs()
            .addMind()
    }
}