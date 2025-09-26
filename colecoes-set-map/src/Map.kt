fun main(args : Array<String>){

    // Construtor - Precisa de dois tipos no <>
    var produtos = HashMap<String, Double>() // Utiliza Pair

    // Preencher o HashMap - Chave -> Valor
    // Put -> Adicionar
    produtos.put("Mouse", 149.99)
    produtos.put("Mouse Gamer", 399.99)
    produtos.put("Teclado", 219.99)
    produtos.put("Teclado Gamer", 219.99)
    produtos.put("Cadeira Gamer", 400.00)

    println(produtos)
    println(produtos.size)

    // Remover da lista Map
    // Usa a chave para Remover
    // Caso tenha mais de um produto com o mesmo nome, ele remove todos os elementos da lista
    produtos.remove("Mouse") // Só a chave
    produtos.remove("Mouse Gamer", 399.99) // Chave e o valor
    println(produtos)

    // Pesquisa através da chave usando o metodo Get
    println(produtos.get("Teclado")) // Devolve um Double (Valor)


}