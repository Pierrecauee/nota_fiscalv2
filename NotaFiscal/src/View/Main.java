package View;

import Model.Product;
import Model.Venda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos da venda:");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = sc.next();
            System.out.println("Digite o preço do produto:");
            double preco = sc.nextDouble();
            System.out.println("Digite a quantidade do produto:");
            int quantidade = sc.nextInt();
            Product product = new Product(nome, preco, quantidade);
            venda.addProduct(product);
        }

        venda.printNota();
    }
}
