import java.util.Scanner

//data
class Note(var nameNote: String, var book: NoteBook) {
    var textNote: String = ""

    init {
        this.text()
    }

    fun text() {
        var inStr: String
        val scanner = Scanner(System.`in`)
        if (textNote == "") {
            textNote = notNullText(this)
        } else {
            println("Текущее содержание заметки ${nameNote}")
            println(textNote)
            println("Хотите изменить  содержание заметки${nameNote}? Введите ДА для изменения, другой символ -ВОЗВРАТ впредидущее меню")
            inStr = scanner.nextLine()
            if (inStr.toLowerCase() == "да") {
                /*while (true){
                println("ВВедите Новое содержание заметки ${nameNote}")
                inStr=scanner.nextLine()
                if (inStr.trim()=="") {   println("Заметка не может быть пустой")}
                    println("ВВедите Новое содержание заметки ${nameNote}")*/
                textNote = notNullText(this)
            }

        }
    }

    //}
    fun notNullText(note: Note): String {
        var inStr: String
        val scanner = Scanner(System.`in`)
        while (true) {
            println("ВВедите содержание заметки ${note.nameNote}")
            inStr = scanner.nextLine()
            if (inStr.trim() == "") {
                println("Заметка не может быть пустой")
            }
            //println("ВВедите Новое содержание заметки ${nameNote}")
            else {
                return inStr
            }
        }
    }

    override fun toString(): String {
        return nameNote
    }
}

