import java.util.ArrayList
open class NoteBook(var name: String) {
    var notelist: ArrayList<Note> = arrayListOf()

    init {
        this.work()
    }
    fun work() {

        var note: Note?
        var win: Window = Window()

        while (true) {

            win.Spisok(notelist, "Заметок")

            when (win.choice("Заметку")) {
                1 -> {notelist.add(Note(win.new(" новой Заметки"), this)) }

                2 -> {if (notEmptiNote(notelist) ) {
                        note = win.change(notelist)
                        println("выбрали заметку $note")
                        note?.text() }
                }

                3 -> { if (notEmptiNote(notelist)){break} }
            }

            clearConsole()

        }
    }
 fun notEmptiNote(notlis: ArrayList<Note>) : Boolean {       //ПРоверяем наличие заметок
     if (notlis.size == 0) {
         println("Заметки отсутствуют. Сохранение Архива не возможно")
         return false
     } else {
         return true
     }
 }
    override fun toString(): String {
        return name
    }
}