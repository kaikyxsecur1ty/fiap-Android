fun main(args: Array<String>) {

    var filmes = HashSet<String>() //Lista única onde não repete dados
    println(filmes.size)

    // Adicionando itens a lista HashSet
    filmes.add("Homem Aranha")
    filmes.add("Batman")
    filmes.add("Coringa")

    println(filmes.size)
    // println(filmes.count()) -> Serve para mostrar o tamanho da lista fun .count
    println(filmes)

    filmes.add("Batman") // Iten repetido
    filmes.add("Batman 2")
    println(filmes)

    // Fazendo uma pesquisa na lista
    println(filmes.contains("Homem Aranha")) // Se conter - True, se não tiver - False
    println(filmes.contains("GOT")) // Se conter - True, se não tiver - False

    // Remover um elemento
    filmes.remove("Batman 2")
    println(filmes)
}