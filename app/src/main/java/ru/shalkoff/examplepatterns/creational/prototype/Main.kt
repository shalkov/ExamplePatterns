package ru.shalkoff.examplepatterns.creational.prototype

import ru.shalkoff.examplepatterns.creational.prototype.example2.Computer

class Main {

    // Пример с data классом
    val firstDog = Dog(
        name = "Альфа",
        age = 1,
        breed = Breed.POOCH,
        location = "Voronezh"
    )
    val secondDog = firstDog.copy(location = "Orlovo")
    val thirdDog = secondDog.copy(breed = Breed.JAGDTERRIER)

    // Пример с ручной реализацией паттерна прототип
    val computer: Computer = Computer(
        processor = "AMD",
        ram = "Kingston",
        motherboard = "ASUS"
    )
    val computer2 = computer.copy(processor = "Intel")
}