fun main() {
    //2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

    var num: Int

    print("Informe um número:")
    num = readln().toInt()

    if(num > 0){
        print("Seu número é POSITIVO!")
    } else if (num < 0){
        print("Seu número é NEGATIVO!")
    } else {
        print("Seu número é igual a ZERO!")
    }

}