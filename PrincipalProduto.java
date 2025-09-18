import java.util.Scanner;

public class PrincipalProduto{
 
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor unitario do produto (R$): ");
        double valor = sc.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();


        Produto p1 = new Produto(nome, valor, quantidade);


        p1.escreverDados();


        double valorTotal = p1.calcularValorTotal();
        System.out.println("Valor total em estoque: R$ " + valorTotal);


        System.out.print("Digite a quantidade para alterar no estoque (pode ser positivo ou negativo): ");
        int quantidadeAlterada = sc.nextInt();
        p1.alterarQuantidade(quantidadeAlterada);


        p1.escreverDados();
        

        sc.close();
    }
}

