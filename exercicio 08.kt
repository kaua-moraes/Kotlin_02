fun main() {

    /*Escreva um programa que calcule a média de quatro números informados
    pelo usuário, mas somente se esses números forem maiores que 0 e menores
    que 10. No final, se a média for maior que cinco o usuário receberá uma
    mensagem "Você passou no teste". Em qualquer outra situação, ele receberá
    uma mensagem de "tente novamente"*/

    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int
    var media = 0
    var result: Int
    var medias = ""
    var count = 0

    println("Digite o primeiro número: ")
    n1 = readln().toInt()
    if (n1 >= 0 && n1 <= 10) {
        media += n1
        count++
    }
    medias += n1.toString() + " "

    println("Digite o segundo número: ")
    n2 = readln().toInt()
    if (n2 >= 0 && n2 <= 10) {
        media += n2
        count++
    }
    medias += n2.toString() + " "

    println("Digite o terceiro número: ")
    n3 = readln().toInt()
    if (n3 >= 0 && n3 <= 10) {
        media += n3
        count++
    }
    medias += n3.toString() + " "

    println("Digite o quarto número: ")
    n4 = readln().toInt()
    if (n4 >= 0 && n4 <= 10) {
        media += n4
        count++
    }
    medias += n4.toString() + " "

    if (count == 0) {
        println("Tente novamente!")
    } else {
        result = media / count
        if (result >= 5) {
            println("Parabéns!")
        } else {
            println("Tente novamente!")
        }
        println("Sua média foi de: $result")
        println("Números digitados: $medias")
    }
}