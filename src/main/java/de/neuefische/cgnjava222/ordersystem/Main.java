package de.neuefische.cgnjava222.ordersystem;

import de.neuefische.cgnjava222.ordersystem.shop.ShopService;
import de.neuefische.cgnjava222.ordersystem.shop.order.Order;
import de.neuefische.cgnjava222.ordersystem.shop.order.OrderRepo;
import de.neuefische.cgnjava222.ordersystem.shop.product.Product;
import de.neuefische.cgnjava222.ordersystem.shop.product.ProductRepo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        OrderRepo orderRepo = new OrderRepo();
        ShopService shopService = new ShopService(productRepo, orderRepo);

        Product product = shopService.getProduct(3);
        System.out.println(product);

        List<Product> products = shopService.listProducts();
        System.out.println(products);

        shopService.addOrder(101, List.of(2,3));
        shopService.addOrder(102, List.of(1));

        Order order = shopService.getOrder(101);
        System.out.println(order);

        List<Order> orders = shopService.listOrders();
        System.out.println(orders);


        shopService.addOrder(123, List.of(999));

    }
}
