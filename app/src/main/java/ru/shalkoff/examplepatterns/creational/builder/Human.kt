package ru.shalkoff.examplepatterns.creational.builder

/**
 * Объект человека
 */
class Human private constructor(
    humanBuilder: HumanBuilder
) {

    init {
        if (humanBuilder.hasHead) { createHead() }
        if (humanBuilder.hasBody) { createBody() }
        if (humanBuilder.hasLegs) { createLegs() }
        if (humanBuilder.hasHands) { createHands() }
    }

    private fun createHead() {
        //TODO создание головы
    }

    private fun createBody() {
        //TODO создание тела
    }

    private fun createLegs() {
        //TODO создание ног
    }

    private fun createHands() {
        //TODO создание рук
    }

    /**
     * Билдер по конструированию человека
     */
    class HumanBuilder {

        var hasHead: Boolean = false
            private set
        var hasBody: Boolean = false
            private set
        var hasLegs: Boolean = false
            private set
        var hasHands: Boolean = false
            private set

        fun addHead(): HumanBuilder {
            hasHead = true
            return this
        }

        fun addBody(): HumanBuilder {
            hasBody = true
            return this
        }

        fun addLegs(): HumanBuilder {
            hasLegs = true
            return this
        }

        fun addHands(): HumanBuilder {
            hasHands = true
            return this
        }

        fun build(): Human = Human(this)
    }
}
