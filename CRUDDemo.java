package com.hibernate_demo;

import java.util.Scanner;
import com.hibernate_demo.CRUDProduct;
import com.hibernate_demo.Product;

public class CRUDDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to CRUD Product Operations");
        CRUDProduct crudProduct = new CRUDProduct();

        boolean shallIContinue = true;
        Scanner sc = new Scanner(System.in);

        while (shallIContinue) {
            System.out.println("What would you like to do today?");
            System.out.println("1. Insert Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display Product");
            System.out.println("4. Exit");
            System.out.print("Enter your Option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter product name: ");
                    String name = sc.next();

                    System.out.print("Enter product category: ");
                    String category = sc.next();

                    System.out.print("Enter product cost: ");
                    double cost = sc.nextDouble();

                    Product product = new Product(id, name, category, cost);
                    crudProduct.insertProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new product name: ");
                    String newName = sc.next();

                    System.out.print("Enter new product category: ");
                    String newCategory = sc.next();

                    System.out.print("Enter new product cost: ");
                    double newCost = sc.nextDouble();

                    Product updatedProduct = new Product(updateId, newName, newCategory, newCost);
                    crudProduct.updateProduct(updatedProduct);
                    break;
                case 3:
                    System.out.print("Enter product ID to display: ");
                    int displayId = sc.nextInt();
                    crudProduct.displayProduct(displayId);
                    break;
                case 4:
                    System.out.println("Thank You!!!!!!");
                    shallIContinue = false;
                    break;
                default:
                    System.out.println("Invalid Option Selected....");
            }
        }

        sc.close();
    }
}