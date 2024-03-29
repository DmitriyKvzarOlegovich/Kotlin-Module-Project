import java.util.Scanner

fun main(args: Array<String>) {

    var booklist: ArrayList<NoteBook> = arrayListOf() //СПИСОК АРХИВОВ
    var noteBook: NoteBook? = null
    var win: Window = Window()
    while (true) {

        win.Spisok(booklist, "Архивов")   //передаем список архивов при статусе 0 или индекс элемента если нужен конкретный архив

        when (win.choice("архив")) {
            1 -> { booklist.add(NoteBook(win.new("нового Архива"))) }

            2 -> { if (booklist.size !== 0) {
                    noteBook = win.change(booklist)
                    println("Текущий архив $noteBook")
                    noteBook?.work()
                } }

            3 -> { break }
        }
        clearConsole()      // Пытался очисить консольный ввод но так и не смог
    }
}

fun clearConsole() {                                           //похоже мертворожденный вариант
    print("\u001b[H\u001b[2J")

}