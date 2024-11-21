package org.example.utils


class UserInput {



    fun readNextInt(prompt: String?): Int {
        do {
            try {
                print(prompt)
                return readln().toInt()
            } catch (e: NumberFormatException) {
                System.err.println("\tEnter a number please.")
            }
        } while (true)
    }

    fun readNextChar(prompt: String?): Char {
        do {
            try {
                print(prompt)
                return readln().first()
            } catch (e: NumberFormatException) {
                System.err.println("\tEnter a character please.")
            }
        } while (true)
    }
}