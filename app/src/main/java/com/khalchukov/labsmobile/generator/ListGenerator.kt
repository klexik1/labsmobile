package com.khalchukov.labsmobile.generator

import kotlin.random.Random

fun generateList(size: Int): List<Int> {
    return List(size) { Random.nextInt(0, 100) }
}