class Main {






}

interface Book

interface EduBook : Book

class ListPrinter<R> where R : List<*>, R : Collection<out Any> {
    fun printList(list: R) {
        for (item in list) {
            println(item)
        }
    }
}

class BookStore< T : Book >(b : T){

    var books: T = b

    fun getBook(): T {
        return books
    }

    fun putBook(j :T) {
        books = j
    }
}

fun main(){
    println("test one")
}