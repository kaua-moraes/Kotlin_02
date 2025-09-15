fun main() {
    //5.  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

    var num1: Float
    var num2: Float
    var num3: Float
    var num4: Float
    var num5: Float
    var num6: Float
    var média: Float

    print("Digite a primeira nota:")
    num1 = readln().toFloat()

    print("Digite a segunda nota:")
    num2 = readln().toFloat()

    print("Digite a terceira nota:")
    num3 = readln().toFloat()

    print("Digite a quarta nota:")
    num4 = readln().toFloat()

    print("Digite a quinta nota:")
    num5 = readln().toFloat()

    print("Digite a sexta nota:")
    num6 = readln().toFloat()

    média = ((num1 + num2 + num3 + num4 + num5 + num6) / 6)

    println("Notas -> $num1 , $num2, $num3, $num4, $num5, $num6")
    print("A média de suas notas são: $média")
}