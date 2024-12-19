package model;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo, String descricao, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Double.compare(preco, produto.preco) == 0 && Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descrição='" + descricao + '\'' +
                ", preço=" + preco +
                '}';
    }

    //só é necessario se for usar o TreeSet na classe ProdutoDao e deve ser implementada a interface Comparable
    @Override
    public int compareTo(Produto o) {
        return this.getDescricao().compareTo(o.getDescricao());
    }
}
