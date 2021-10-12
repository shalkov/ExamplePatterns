package ru.shalkoff.examplepatterns.creational.prototype

/**
 * Тут реализуем паттерн возможностями языка Kotlin
 * ( добавляем ключевое слово data и у объекта появляется метод copy() )
 */
data class Dog(
    val name: String,
    val age: Int,
    val breed: Breed,
    val location: String
)


enum class Breed {
    POOCH, // дворняжка
    JAGDTERRIER // ягдтерьер
}