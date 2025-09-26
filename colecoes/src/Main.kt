fun main(args: Array<String>) {

    val cidades = arrayOf<String>("São Paulo", "Rio de Janeiro", "Bahia", "Paraná") // <> Define o tipo do Array
    val numero = arrayOf<Int>(100)

    println(numero[0] * 2)

    println(cidades[1])
    println(cidades[3])

    // Tamanho da variável, quantos dados tem
    println("Tamanho de dados do Array Cidades: ${cidades.size}")

    // Alterando o valor da posição 3
    cidades[3] = "Maranhão"
    println(cidades[3])

    var temCidade = cidades.isEmpty() // Se estiver vazio retorna True e se NÃO estiver vázio retorna um False
    println(temCidade)

    var frutas = arrayOf<Double>() // Definindo o tipo só para a IDE não reclamar, se nao definir ele nao sabe o que esperar
    println("Frutas está vazio? ${frutas.isEmpty()}, Quantos dados tem? ${frutas.size}\n") // Retorna True pois o array está vázio

    var pessoas = arrayListOf<String>()
    println("Pessoas: ${pessoas.size}")

    pessoas.add("João")
    pessoas.add("Maria")
    pessoas.add("Jaime")
    pessoas.add("Cirilo")
    pessoas.add("João") // Permite adicionar itens repetidos

    println("Pessoas: ${pessoas.size}")

    // Fazer uma pesquisa dentro do Array

    println(pessoas.contains("Pedro")) // Se encontrar o elemento Pedro ele retorna True caso não encontre retorna False
    println(pessoas.contains("Maria"))

    // Ver todos os itens da lista
    println(pessoas)

    // Remover uma pessoa
    pessoas.remove("João")
    println(pessoas)
}