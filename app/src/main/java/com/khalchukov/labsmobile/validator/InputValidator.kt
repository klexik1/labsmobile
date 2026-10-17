package com.khalchukov.labsmobile.validator

class InputValidator {


    fun parseSize(text: String): Int? {
        val number = text.toIntOrNull()
        return if (number != null && number > 0) number else null
    }
}
