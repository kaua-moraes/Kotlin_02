fun main() {
    //4. Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e coloque os dois maiores

    var numA: Int
    var numB: Int
    var numC: Int
    var Result: Int

    print("Digite o primeiro número:")
    numA = readln().toInt()

    print("Digite o segundo número:")
    numB = readln().toInt()

    print("Digite o terceiro número:")
    numC = readln().toInt()

    if(numA < numB && numA < numC){
        Result = numB + numC
    } else if (numB < numA && numB < numC){
        Result = numA + numC
    } else {
        Result = numA + numB
    }

    print("A soma dos dois maiores número é: ${Result}")
}