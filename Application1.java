package tokio.school;

import tokio.school.database.Database;
import tokio.school.database.domain.Product;

import java.util.Set;

public class Application1 {

     public Application1() {
     }
     public void seeProducts() {
         Database database = new Database();
         Set<Product> products = database.findProducts();

         for (Product product : products)
             System.out.println(product);
         }
         public void seeProductBetweenPrices(float minPrice, float maxPrice){
         Database database = new Database();
         Set<Product> products = database.findProductByPrice(minPrice,maxPrice);

             System.out.println(products.toString());
         }


     }

