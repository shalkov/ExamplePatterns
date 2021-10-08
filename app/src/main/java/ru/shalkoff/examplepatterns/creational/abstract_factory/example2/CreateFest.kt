package ru.shalkoff.examplepatterns.creational.abstract_factory.example2

import ru.shalkoff.examplepatterns.creational.abstract_factory.example2.univercity.VgtuUniversity
import ru.shalkoff.examplepatterns.creational.abstract_factory.example2.univercity.VsuUniversity

/**
 * Предполагаем, что преподаватели и студенты нужны для проведения какого-то фестиваля
 */
class CreateFest {

    init {
        val vsuUniversity: AbstractUniversity = VsuUniversity()
        val vgtuUniversity: AbstractUniversity = VgtuUniversity()

        val devFestVoronezh2020: DevFestVoronezh = DevFestVoronezh2020(vsuUniversity)
        val devFestVoronezh2021: DevFestVoronezh = DevFestVoronezh2021(vgtuUniversity)
    }
}