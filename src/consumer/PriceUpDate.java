package consumer;

import java.util.function.Consumer;

public class PriceUpDate implements Consumer<Product> {

    public static void main(String[] args) {

    }

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);

    }
}
