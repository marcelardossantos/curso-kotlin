package fundamentos

fun main() {

//    val x = 1

//    when(x) {
//        5, -5 -> println("x == 5")
//        8 -> println("x == 8")
//        10 -> {
//            println("x == 10")
//            println("x é uma dezena")
//        }
//        in 11..15 -> println("x está entre 11 e 15")
//        !in 16..20 -> println("x não está entre 16 e 20")
//        else -> println("Número não mapeado")
//    }

    when {
        comecaComOi(5) -> println(5)
//        comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?")
        comecaComOi("oi, estou bem!") -> println("oi, estou bem!")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith ("oi")
        else -> false
    }
}