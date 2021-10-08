package ru.shalkoff.examplepatterns.creational.abstract_factory.example2

abstract class DevFestVoronezh(abstractUniversity: AbstractUniversity) {

    val student: Student = abstractUniversity.createStudent()
    val teacher: Teacher = abstractUniversity.createTeacher()
}