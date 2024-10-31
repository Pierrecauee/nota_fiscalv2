package Model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Product> products;

    public Venda() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printNota() {
        double total = 0.0;
        System.out.println("Nota de Venda:");
        for (Product p : products) {
            double subtotal = p.getPrice() * p.getQuantity();
            total += subtotal;
            System.out.printf("Produto: %s, Quantidade: %d, Preço: %.2f, Subtotal: %.2f%n",
                    p.getName(), p.getQuantity(), p.getPrice(), subtotal);
        }
        System.out.printf("Valor Total da Venda: %.2f%n", total);
    }
}
