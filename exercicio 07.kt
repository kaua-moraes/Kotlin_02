fun main() {


    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int
    var n5: Int
    var n6: Int
    var soma: Int = 0
    var numero: String = ""

    print("Digite o primeiro número: ")
    n1 = readln().toInt()
    if (n1 < 72) {
        soma += n1
    }
    numero += n1.toString() + " "

    print("Digite o segundo número: ")
    n2 = readln().toInt()
    if (n2 < 72) {
        soma += n2
    }
    numero += n2.toString() + " "

    print("Digite o terceiro número: ")
    n3 = readln().toInt()
    if (n3 < 72) {
        soma += n3
    }
    numero += n3.toString() + " "

    print("Digite o quarto número: ")
    n4 = readln().toInt()
    if (n4 < 72) {
        soma += n4
    }
    numero += n4.toString() + " "

    print("Digite o quinto número: ")
    n5 = readln().toInt()
    if (n5 < 72) {
        soma += n5
    }
    numero += n5.toString() + " "

    print("Digite o sexto número: ")
    n6 = readln().toInt()
    if (n6 < 72) {
        soma += n6
    }
    numero += n6.toString() + " "

    println("Números digitados: $numero")
    println("A soma dos números digitados é igual a: $soma")
}