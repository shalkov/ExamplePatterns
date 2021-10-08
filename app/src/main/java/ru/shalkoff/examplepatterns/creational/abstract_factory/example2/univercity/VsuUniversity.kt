package ru.shalkoff.examplepatterns.creational.abstract_factory.example2.univercity

import ru.shalkoff.examplepatterns.creational.abstract_factory.example2.*

class VsuUniversity : AbstractUniversity() {

    override fun createStudent(): Student {
        return VsuStudent()
    }

    override fun createTeacher(): Teacher {
        return VsuTeacher()
    }
}