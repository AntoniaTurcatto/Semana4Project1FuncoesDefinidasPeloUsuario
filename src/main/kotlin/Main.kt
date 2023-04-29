fun main() {
    println(soma(1,2))

    println(parTest(2))
    println(parTest(31))

    println(palindromo("ana"))
    println(palindromo("bia"))

    val array1= arrayOf<Int>(1,3,11,4)
    println(arrayMax(array1))

    val array2 = arrayOf("Marca", "Ana", "Diego", "Felipe","Márcio")
    println(arrayMoreThanFive(array2))
}

//- Crie uma função que receba dois números inteiros como argumentos e retorne a
//soma dos mesmos.

fun soma(n1:Int, n2:Int):Int{
    val result=n1+n2
    return result
}

//2 - Crie uma função que receba um número inteiro como argumento e retorne
//verdadeiro se o mesmo for par e falso caso contrário.

fun parTest(number:Int):Boolean{
    return if(number%2==0) {
        true
    } else {
        false
    }
}

//3 - Crie uma função que receba uma string como argumento e retorne verdadeiro se a
//mesma for palíndromo (ou seja, lida da esquerda para direita é igual a lida da direita
//para esquerda) e falso caso contrário.

fun palindromo(word:String):Boolean{
    return if(word.equals(word.reversed())){
        true
    } else {
        false
    }
}

//4 - Crie uma função que receba um array de números inteiros como argumento e
//retorne o maior valor presente no array.

fun arrayMax(array: Array<Int>):Int{
    var maxValue= 0
    for(i in 0..array.lastIndex){
        if(i==0){
            maxValue=array[i]
        } else {
            if(array[i]>maxValue){
                maxValue=array[i]
            }
        }
    }
    return maxValue
}

//5 - Crie uma função que receba um array de strings como argumento e retorne uma
//nova lista contendo apenas as strings que possuem mais de 5 caracteres.

fun arrayMoreThanFive(array: Array<String>):MutableList<String>{
    val stringList = mutableListOf<String>()
    for (i in 0..array.lastIndex){
        if (array[i].length>5){
            stringList.add(array[i])
        }
    }
    return stringList
}