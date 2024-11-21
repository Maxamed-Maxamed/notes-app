package org.example

import java.lang.System.exit

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    mainMenu()
    runMenu()
}

fun mainMenu() : Int {
  println("")
  println("------------------------")
  println("Note Keeper Application")
  println("------------------------")
  println("")
    println("---Note Menu---")
  println("1). Add Note")
  println("2). View Note")
  println("3). Edit Note")
  println("4). Delete Note")
  println("0). ExitApp")
  println("========================>")
    return readlnOrNull()?.toIntOrNull() ?: -1 // Return -1 if the input is not a valid integer
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
            else -> println("Invalid option" + option)
        }

    }
    while (true)

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
