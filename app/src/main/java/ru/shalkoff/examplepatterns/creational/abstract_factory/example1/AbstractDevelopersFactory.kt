package ru.shalkoff.examplepatterns.creational.abstract_factory

import ru.shalkoff.examplepatterns.creational.abstract_factory.example1.Junior
import ru.shalkoff.examplepatterns.creational.abstract_factory.example1.Middle

/**
 * Симейство разработчиков в Surf
 */
class SurfJunior : Junior
class SurfMiddle : Middle

/**
 * Симейство разработчиков в DataArt
 */
class DataArtJunior: Junior
class DataArtMiddle: Middle

/**
 * Абстрактная фабрика с разработчика
 */
abstract class AbstractDevelopersFactory {

    abstract fun createJunior(): Junior
    abstract fun createMiddle(): Middle
}

/**
 * Фабрика по производству разработчиков в Surf
 */
class SurfDevelopersFactory : AbstractDevelopersFactory() {

    override fun createJunior(): Junior {
        return SurfJunior()
    }

    override fun createMiddle(): Middle {
        return SurfMiddle()
    }
}

/**
 * Фабрика по производству разработчиков в DataArt
 */
class DataArtDevelopersFactory : AbstractDevelopersFactory() {

    override fun createJunior(): Junior {
        return DataArtJunior()
    }

    override fun createMiddle(): Middle {
        return DataArtMiddle()
    }
}