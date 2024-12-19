package view;

import dao.ProdutoDao;
import model.Produto;

public class Main {
    public static void main(String[] args) {

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.adicionar(  new Produto(2, "Café", 8.50) );
        produtoDao.adicionar( new Produto(1, "Arroz", 5.80) );
        produtoDao.adicionar( new Produto(4, "Macarrão", 4.50) );
        produtoDao.adicionar( new Produto(6, "Bolacha", 3.50) );

        produtoDao.atualizar( new Produto(1, "Arroz", 6) );
        System.out.println("Produtos: " + produtoDao.getProdutos());

        produtoDao.remover( new Produto(4, "Macarrão", 4.5) );
        System.out.println("Produtos após a remoção de um item: " + produtoDao.getProdutos());


    }
}