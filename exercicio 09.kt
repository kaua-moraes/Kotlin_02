
fun main() {
    /*Escreva um programa para ler o ano de nascimento de uma
    pessoa e escrever uma mensagem que diga se ela poderá ou
    não votar este ano.*/

    var anoNasc : Int
    var Result: Int

    println("Digite seu ano de nascimento: ")
    anoNasc = readln().toInt()

    if (anoNasc > 2009) {
        Result = 2025 - anoNasc
        println("Sua idade é $Result")
        println("Você ainda não tem idade para votar!")
    }
    else {
        Result = 2025 - anoNasc
        println("Sua idade é $Result")
        println("Você pode votar!")
    }
}
