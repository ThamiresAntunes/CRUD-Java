package dao;

import model.Produto;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

//Classe com as ações de CRUD que podem ser realizadas na lista de produtos
public class ProdutoDao{

    private Set<Produto> produtos;

    public ProdutoDao(){
        //produtos = new HashSet<>(); //ordena pelo hash code
        produtos = new TreeSet<>(); //ordena pela comparacao passada no compareTo
    }

    public boolean adicionar(Produto produto){
        return produtos.add(produto);
    }

    public Set<Produto> getProdutos(){
        return produtos;
    }

    public boolean remover(Produto produto){
        return produtos.remove(produto);
    }
    public boolean atualizar(Produto produto){
        //tenta remover e adicionar o novo produto, caso as duas condicoes sejam true, o retorno é true e o produto foi atualizado
        return produtos.remove(produto) && produtos.add(produto);
    }

    /*
    public boolean atualizar(Produto produto) {
        //tenta remover o produto, se for removido tenta adicionar o produto atualizado
        if (produtos.remove(produto)) {
            if (produtos.add(produto)) { //tenta adicionar o novo produto
                return true; // Produto atualizado com sucesso
            } else {
                return false; //produto não foi ser adicionado
            }
        } else {
            return false; //produto não foi encontrado para remoção
        }
    }
    */
}
