package ru.shalkoff.examplepatterns.creational.prototype.example2

/**
 * Реализация паттерна прототип, без использования data класса.
 */
class Computer(
    val processor: String,
    val ram: String,
    val motherboard: String
) {

    fun copy(
        processor: String = this.processor,
        ram: String = this.ram,
        motherboard: String = this.motherboard
    ): Computer {
        return Computer(
            processor,
            ram,
            motherboard
        )
    }
}