package ru.shalkoff.examplepatterns.creational.abstract_factory

/**
 * В классе инкапсулирована логика создания разработчиков
 */
class CreateDevelopers {

    private val surfDevFactory = SurfDevelopersFactory()
    private val dataArtDevFactory = DataArtDevelopersFactory()

    init {
        val company1 = Company(surfDevFactory)
        val company2 = Company(dataArtDevFactory)
    }
}