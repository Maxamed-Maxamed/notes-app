package org.example

import java.lang.System.exit

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    mainMenu()
    runMenu()
}

fun mainMenu() : Int {
    print("""
          ----------------------------------
          |        NOTE KEEPER APP         |
          ----------------------------------
          | NOTE MENU                      |
          |   1) Add a note                |
          |   2) List all notes            |
          |   3) Update a note             |
          |   4) Delete a note             |
          ----------------------------------
          |   0) Exit                      |
          ----------------------------------
          ==>> """) // Read the user's input as a string and convert it to an integer value using the toIntOrNull() function of the readlnOrNull() function.
    // Read the user's input as a string and convert it to an integer
//    return readlnOrNull()?.toIntOrNull() ?: -1 // Return -1 if the input is not a valid integer

    return readln().toInt() // Read the user's input as a string and convert it to an integer value using the toIntOrNull() function of the readlnOrNull() function.
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1 -> addNote() // handle add the note menu option here - use the addNote() function
            2 -> viewNote() // handle view the note menu option here - use the viewNote() function
            3 -> editNote() // handle edit the note menu option here - use the editNote() function
            4 -> deleteNote() // handle delete the note menu option here - use the deleteNote() function
            0 -> exitApp() // handle exit the app menu option here - use the exitApp() function
//            else -> println("Invalid option" + option) // handle invalid option here - print a message
        else -> println("Invalid option $option") // handle invalid option here - print a message
        }

    }
    while (true) // repeat the menu until the user exits the app - use a do-while loop and a while loop with a condition that is always true

}

fun addNote() {
    println("Add a note")
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
