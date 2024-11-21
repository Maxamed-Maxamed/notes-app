
package org.example

import java.lang.System.exit
import io.github.oshai.kotlinlogging.KotlinLogging

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    mainMenu()
    runMenu()
    readNextChar( " > ==>>")
}

private val logger = KotlinLogging.logger {}

fun mainMenu() : Int {
    print(
        """ 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return readNextInt(" > ==>>")

}








fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1 -> addNote()
            2 -> viewNote()
            3 -> editNote()
            4 -> deleteNote()
            0 -> exitApp()
        else -> println("Invalid option $option") // handle invalid option here - print a message
        }

    }
    while (true) // repeat the menu until the user exits the app - use a do-while loop and a while loop with a condition that is always true

}

fun addNote() {
    logger.info { "addNote() function invoked" }
}

fun viewNote() {
    println("View a note")
}
fun editNote() {
    println("Edit a note")
}
fun deleteNote() {
    println("Delete a note")
}
fun exitApp() {
    println("Exit App BYE BYE")
    exit(0)
}


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