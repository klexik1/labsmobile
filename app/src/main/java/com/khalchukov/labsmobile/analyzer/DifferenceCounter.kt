package com.khalchukov.labsmobile.analyzer

import kotlin.math.abs

    fun countDifferent(list: List<Int>, average: Double, diff: Int): Int {
        return list.count { abs(it - average) >= diff }
    }
