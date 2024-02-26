import java.util.Scanner

//data
class Note(var nameNote: String, var book: NoteBook) {
    var textNote: String = ""
init {
    this.text()
}
    fun text() {
        val inStr:String
        val scanner = Scanner(System.`in`)
               if (textNote=="") {println("ВВедите содержание заметки ${nameNote}")
                                  textNote=scanner.nextLine()  }
    else{println("Текущее содержание заметки ${nameNote}")
        println(textNote)
                   println("Хотите изменить  содержание заметки${nameNote}? Введите ДА для изменения, другой символ -ВОЗВРАТ впредидущее меню")
                  inStr=scanner.nextLine()
                   if (inStr.toLowerCase()=="да") {
        println("ВВедите Новое содержание заметки ${nameNote}")
        textNote=scanner.nextLine()}
            }
        }
    override fun toString(): String { return nameNote
    }
}

