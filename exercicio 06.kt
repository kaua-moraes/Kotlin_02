fun main() {
    //6. Faça um programa que receba quatro valores informados pelo usuário,
    // mas informe somente o primeiro, o último e o maior de todos eles
    // (considere que todos os números informados serão diferentes)

    var num1: Int
    var num2: Int
    var num3: Int
    var num4: Int
    var maiorNumero: Int

    println("Digite o primeiro número:")
    num1 = readln().toInt()

    println("Digite o segundo número:")
    num2 = readln().toInt()

    println("Digite o terceiro número:")
    num3 = readln().toInt()

    println("Digite o quarto número:")
    num4 = readln().toInt()

    maiorNumero = num1

    if(num2 > maiorNumero){
        maiorNumero = num2
    }
    if (num3 > maiorNumero){
        maiorNumero = num3
    }
    if (num4 > maiorNumero){
        maiorNumero = num4
    }

    println("Primeiro número: $num1")
    println("Último número: $num4")
    println("Maior número: $maiorNumero")

}