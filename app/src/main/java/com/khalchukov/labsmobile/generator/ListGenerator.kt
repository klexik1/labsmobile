package com.khalchukov.labsmobile.generator

import kotlin.random.Random

class ListGenerator {

    fun generate(size: Int): List<Int> {
        return List(size) { Random.nextInt(0, 100) }
    }
}
