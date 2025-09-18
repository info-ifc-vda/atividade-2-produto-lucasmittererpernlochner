import java.util.Scanner;

public class Produto {
    String nome;
    double valor;
    int quantidadeEmEstoque;

    Scanner sc = new Scanner(System.in);


    public Produto(String nome, double valor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void escreverDados() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Valor Unitario: R$ " + valor);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public double calcularValorTotal() {
        return valor * quantidadeEmEstoque;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
        if (this.quantidadeEmEstoque < 0) {
            System.out.println("Nao é possivel ter quantidade negativa em estoque.");
            this.quantidadeEmEstoque = 0;
        }
    }
}