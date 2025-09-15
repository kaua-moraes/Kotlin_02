fun main() {
    /*10. Tendo como entrada a altura e o gênero designado ao nascer
    (codificado da seguinte forma: 1: feminino - 2: masculino - ) de
    uma pessoa, construa um programa que calcule e imprima seu peso ideal.*/

    var opcao : Int
    var altura : Double
    var resultado : Double

    println("--- PESO IDEAL ---")
    println("Escolha uma opção:")
    println("1- Feminino")
    println("2- Masculino")
    opcao = readLine()!!.toInt()

    println("Informe sua altura: ")
    altura = readLine()!!.toDouble()

    if(opcao == 1){
        resultado = ((62.1 * altura) - 44.7)
        println("O seu peso ideal é $resultado")
    } else {
        resultado = ((72.7 * altura) - 58)
        println("O seu peso ideal é $resultado")
    }
}