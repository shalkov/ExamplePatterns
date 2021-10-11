package ru.shalkoff.examplepatterns.creational.factory_method

class Main {

    init {
        val birdFactory = BirdFactory()
        val bird = birdFactory.createBird(BirdType.CROW)
    }
}