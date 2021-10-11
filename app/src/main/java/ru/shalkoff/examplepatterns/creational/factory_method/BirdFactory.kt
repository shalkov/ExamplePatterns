package ru.shalkoff.examplepatterns.creational.factory_method

import ru.shalkoff.examplepatterns.creational.factory_method.birds.Bird
import ru.shalkoff.examplepatterns.creational.factory_method.birds.BirdCrow
import ru.shalkoff.examplepatterns.creational.factory_method.birds.BirdEagle
import ru.shalkoff.examplepatterns.creational.factory_method.birds.BirdFalcon

/**
 * Фабрика по производству птиц.
 */
class BirdFactory {

    fun createBird(birdType: BirdType): Bird {
        return when (birdType) {
            BirdType.CROW -> BirdCrow()
            BirdType.FALCON -> BirdFalcon()
            BirdType.EAGLE -> BirdEagle()
        }
    }
}