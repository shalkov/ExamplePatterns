package ru.shalkoff.examplepatterns.creational.abstract_factory.example2.univercity

import ru.shalkoff.examplepatterns.creational.abstract_factory.example2.*

class VgtuUniversity : AbstractUniversity() {

    override fun createStudent(): Student {
        return VgtuStudent()
    }

    override fun createTeacher(): Teacher {
        return VgtuTeacher()
    }
}