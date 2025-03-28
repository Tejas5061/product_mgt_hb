package com.hibernate_demo;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		System.out.println("***** WELCOME to Product Management *****");

		CRUDProduct crudProduct = new CRUDProduct();
		Scanner sc = new Scanner(System.in);

		boolean shallIContinue = true;
		while (shallIContinue) {

			System.out.println("What would you like to do today?");
			System.out.println("1.Insert Product");
			System.out.println("2.Update Product");
			System.out.println("3.Display Product");
			System.out.println("4.Exit");
			System.out.print("Enter your Option: ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				Product p1 = new Product(101, "HP", "Gaming", 456798);
				crudProduct.insertProduct(p1);
				break;
			case 2:
				Product p2 = new Product(101, "DELL", "Gaming", 456798);
				crudProduct.updateProduct(p2);
				break;
			case 3:
				crudProduct.displayProduct(101);
				break;
			case 4:
				System.out.println("Thank You!!!!!!!");
				shallIContinue = false;
				break;
			default:
				System.out.println("Invalid Option Selected....");
			}
		}
	}
}
