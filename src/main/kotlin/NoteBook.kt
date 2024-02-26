import java.util.ArrayList
import java.util.Scanner

open class NoteBook(var name: String) {
    var notelist: ArrayList<Note> = arrayListOf()
    init {
        this.work()
    }
       fun work (){
       var sum =0

        //var inStr:String
        //var notelist: ArrayList<Note> = arrayListOf()
        var note :Note?
        //val scanner = Scanner(System.`in`)
        var win: Window=Window()



        while (true) {


            win.Spisok(notelist,"Заметок")

            when (win.choice("Заметку")) {
                1 -> {notelist.add(Note(win.new(" новой Заметки"),this))}
                2 -> {if(notelist.size!==0) {note=win.change(notelist)
                    println("выбрали заметку $note")
               note?.text()
                }}
                3 -> {break}
            }

            clearConsole()
            //break
        }
    }

    override fun toString(): String { return name }
}