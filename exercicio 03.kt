fun main() {
    //3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    var numA: Int
    var numB: Int
    var numC: Int

    print("Digite o primeiro número:")
    numA = readln().toInt()

    print("Digite o segundo número:")
    numB = readln().toInt()

    print("Digite o primeiro número:")
    numC = readln().toInt()

    if(numA > numB && numA > numB){
        print("$numA é o maior número!")
    } else if(numB > numA && numB > numC){
        print("$numB é o maior número!")
    } else {
        print("$numC é o maior número!")
    }

}