fun main() {
    //1. Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

    var num1: Int
    var num2: Int

    println("Digite o primeiro número: ")
    num1 = readln().toInt()

    print("Digite o segundo número: ")
    num2 = readln().toInt()

    if(num1 > num2){
        print("O $num1 é maior que $num2!")
    } else if (num2 > num1){
        print("O $num2 é maior que $num1!")
    } else {
        print("Seus números são iguais!")
    }

}