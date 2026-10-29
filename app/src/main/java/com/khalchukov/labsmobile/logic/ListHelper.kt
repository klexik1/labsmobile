package com.khalchukov.labsmobile.logic

import com.khalchukov.labsmobile.analyzer.countDifferent
import com.khalchukov.labsmobile.calculator.getAverage
import com.khalchukov.labsmobile.generator.generateList
import com.khalchukov.labsmobile.model.ResultData
import com.khalchukov.labsmobile.validator.parseSize

const val DIFF = 5

const val ERROR_TEXT = "Введите положительное число!"

fun solve(size: Int): ResultData {
    val list = generateList(size)
    val average = getAverage(list)
    val count = countDifferent(list, average, DIFF)
    return ResultData(list, average, count)
}

fun formatResult(result: ResultData): String {
    return "Список: ${result.list}\n\n" +
            "Среднее: %.2f\n\n".format(result.average) +
            "Элементов, отличающихся от среднего на $DIFF и больше: ${result.count}"
}

fun processInput(text: String): String {
    val size = parseSize(text) ?: return ERROR_TEXT
    return formatResult(solve(size))
}