package tokio.school;

import tokio.school.database.Database;
import tokio.school.database.User;
import tokio.school.database.domain.Order;
import tokio.school.database.domain.Product;

import java.time.LocalDateTime;
import java.util.Set;

public class Application3 {
    private User currentUser;
    private Order currentOrder;

    public Application3() {
    }

    public void seeProducts() {
        Database database = new Database();
        Set<Product> products = database.findProducts();

        for (Product product : products)
            System.out.println(product);
    }

    public void seeProductBetweenPrices(float minPrice, float maxPrice) {
        Database database = new Database();
        Set<Product> products = database.findProductByPrice(minPrice, maxPrice);

        System.out.println(products.toString());
    }

    public void addProductToOrder(Product product) {
        if (currentOrder == null) {
            currentOrder = new Order(98341, "p93825", currentUser);
        }
        if (!currentOrder.addProduct(product)) {
            System.out.println("El producto ya etsba en la cesta");
            return;
        }
        System.out.println("Producto aniadido a la cesta ");
        // Resto de cosas: actualizar precio, stock actual, .....

    }


}

