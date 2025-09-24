fun main(args: Array<String>) {

    var nome = "Kaiky"

    println(nome)

    nome = "Maria"

    println(nome.length)

    var cidade: String = "São Paulo"

    println("A palavra ${cidade} possui ${cidade.length} letras") // concatenação

    val sexoMasculino: Char = 'M'
    var sexoFeminino = 'F'

    println(sexoMasculino)
    println(sexoFeminino)

    // Pair, criando duas variáveis de uma vez só
    var (valor, descricao) = Pair(100, "Mouse")

    println(valor)
    println(descricao)

    var produto2: Pair<Int, String> = Pair(200, "Teclado")
    // Imprimir os valores das variáveis
    println(produto2.first)
    println(produto2.second)
}