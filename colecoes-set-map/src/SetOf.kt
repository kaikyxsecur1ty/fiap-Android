fun main(args: Array<String>) {

    // Construtor setOf
    var precos = setOf<Double>(45.9, 78.8, 32.5, 87.4) // Pode omitir o <>
    // var precos2 = setOf(45.9, 78.8, 32.5, 87.4)
    println(precos)

    println(precos.contains(45.9)) // True
    println(precos.contains(11.9)) // False


}