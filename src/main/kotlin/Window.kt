
import java.util.ArrayList
import java.util.Scanner

class Window() {

fun  <T> Spisok (list: ArrayList<T>, name: String) {  //вывод списка элементов с понятной нумерацией

    var k = 1;

    if (list.size!==0) {
        println("Список $name:")
        for (i in list) {
            println(" $k - ${i}")
            k++
        }
    }
    else{println("Список $name: Пуст")}
}


fun choice(type: String): Int {               //Функция Создание Выбор или Возврат
    val scanner = Scanner(System.`in`)
   var inStr:Int
    while (true) {                            // безконечный цикл пока не появится меню.
    println("1. Создать $type")
    println("2. Выбрать $type")
    println("3. Выход")

    if (scanner.hasNextInt()) {       // проверка на интовую переменную
        inStr = scanner.nextInt()     //

        if (inStr<=3) {                 // проверка на выбор меню
            when (inStr) {
                1 -> { return 1 }
                2 -> { return 2 }
                3 -> { return 3 }
                else -> { return 0 }
            }
            break
        }

    }
        else {println("Введенный ${scanner.nextLine()}  не является пунктом меню. Выберите варианты 1, 2, 3.")}
}
    clearConsole()
}
    fun new(type: String): String {              // Функция создания нового элемента
        //println("защел в новый")
        val scanner = Scanner(System.`in`)
        var inStr:String
        //inStr = scanner.nextLine()
        println("Введите имя $type")
        inStr = scanner.nextLine()
        return inStr
        }
    fun <T> change(list: ArrayList<T>,): T? {    //функция выбора из списка элементов

        while (true) {

        if (list.get(0) is Note){println("Выберите Заметку или 0 для возврата")
            Spisok (list," Заметок")}
            else {println("Выберите с каким архивом будем работать или 0 для возврата")
                Spisok (list," Архивов")}

        val scanner = Scanner(System.`in`)
        var inStr:Int

        if (scanner.hasNextInt()) {       // проверка на интовую переменную
            inStr = scanner.nextInt()     //
            // println("защел в инт $inStr")
            if (inStr==0) {return null}
            if (inStr<=list.size) {                 // проверка на выбор меню

                return list.get(inStr-1)
                break
            }
            else {println("Архив с номером ${inStr} отсутствует в списке архиво")}
        }
        else {println("ВВеденный ${scanner.nextLine()}  не является пунктом меню. Выберите вариант.")}

        }
    }




}