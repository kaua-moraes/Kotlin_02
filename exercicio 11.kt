fun main() {
    /*Escreva um programa para ler 2 valores inteiros informados
    pelo usuário e uma das seguintes operações a serem executadas
    (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.*/

    var opcao : Int
    var num1 : Int
    var num2 : Int
    var result : Int

    println("--- CALCULADORA ---")
    println("Escolha uma operação:")
    println("1- Adição")
    println("2- Subtração")
    println("3- Divisão")
    println("4- Multiplicação")
    opcao = readLine()!!.toInt()

    if (opcao == 1){
        println("Opção escolhida: ADIÇÃO")
        println("Informe o primeiro número: ")
        num1 = readLine()!!.toInt()

        println("Informe o segundo número: ")
        num2 = readLine()!!.toInt()

        result = num1 + num2

        println("O resultado é: $result")
    }
    else if (opcao == 2){
        println("Opção escolhida: SUBTRAÇÃO")
        println("Informe o primeiro número: ")
        num1 = readLine()!!.toInt()

        println("Informe o segundo número: ")
        num2 = readLine()!!.toInt()

        result = num1 - num2

        println("O resultado é: $result")
    }
    else if (opcao == 3){
        println("Opção escolhida: DIVISÃO")
        println("Informe o primeiro número: ")
        num1 = readLine()!!.toInt()

        println("Informe o segundo número: ")
        num2 = readLine()!!.toInt()

        result = num1 / num2

        println("O resultado é: $result")
    }
    else if (opcao == 4){
        println("Opção escolhida: MULTIPLICAÇÃO")
        println("Informe o primeiro número: ")
        num1 = readLine()!!.toInt()

        println("Informe o segundo número: ")
        num2 = readLine()!!.toInt()

        result = num1 * num2

        println("O resultado é: $result")
    }
    else {
        println("OPÇÃO INVÁLIDA!!!!")
    }

}