package com.khalchukov.labsmobile.analyzer

import kotlin.math.abs

class DifferenceCounter {

    fun count(list: List<Int>, average: Double, diff: Int): Int {
        return list.count { abs(it - average) >= diff }
    }
}
