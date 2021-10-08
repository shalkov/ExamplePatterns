package ru.shalkoff.examplepatterns.creational.abstract_factory.example1

import ru.shalkoff.examplepatterns.creational.abstract_factory.AbstractDevelopersFactory

/**
 * Какая-то гепотетическая компания, которой нужны разработчик
 * (при этом ей без разницы какие и откуда они)
 */
class Company(devFactory: AbstractDevelopersFactory) {

    private var junior: Junior = devFactory.createJunior()
    private var middle: Middle = devFactory.createMiddle()
}