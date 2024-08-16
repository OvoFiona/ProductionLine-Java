
package Productionline;

import java.util.*;


public class SortProduct {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new AudioPlayer("Walkman", "MP3"));
        products.add(new MoviePlayer("Home Theater", new Screen("3840x2160", 60, 5), MonitorType.LED));
        products.add(new AudioPlayer("iPod", "AAC"));

        Collections.sort(products, Comparator.comparing(Product::getName));

        print(products);
    }

    public static void print(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    }
    

