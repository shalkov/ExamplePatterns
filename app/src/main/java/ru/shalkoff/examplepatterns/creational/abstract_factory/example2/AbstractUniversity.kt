package ru.shalkoff.examplepatterns.creational.abstract_factory.example2

abstract class AbstractUniversity {

    abstract fun createStudent(): Student
    abstract fun createTeacher(): Teacher
}