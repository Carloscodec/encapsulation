package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Product: ");
		String name = input.nextLine();
		System.out.print("Price: $");
		double price = input.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println("Product data:" + product);
		
		System.out.println();
		System.out.print("Enter the amount of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter the amount of products to be removed from stock: ");
		quantity = input.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(product);
		
		input.close();

	}

}
