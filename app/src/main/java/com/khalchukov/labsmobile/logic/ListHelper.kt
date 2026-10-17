package com.khalchukov.labsmobile.logic

import com.khalchukov.labsmobile.analyzer.DifferenceCounter
import com.khalchukov.labsmobile.calculator.AverageCalculator
import com.khalchukov.labsmobile.generator.ListGenerator
import com.khalchukov.labsmobile.model.ResultData
import com.khalchukov.labsmobile.validator.InputValidator

class ListHelper {

    private val generator = ListGenerator()
    private val calculator = AverageCalculator()
    private val counter = DifferenceCounter()
    private val validator = InputValidator()

    fun checkInput(text: String): Int? {
        return validator.parseSize(text)
    }

    fun solve(size: Int): ResultData {
        val list = generator.generate(size)
        val average = calculator.getAverage(list)
        val count = counter.count(list, average, 5)
        return ResultData(list, average, count)
    }
}
