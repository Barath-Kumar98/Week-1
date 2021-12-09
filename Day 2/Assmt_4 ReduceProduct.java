package com.eg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product {
	String name;
	double price;
	
	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

public class ReduceProduct {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		Product p1 = new Product("p1", 100);
		Product p2 = new Product("p2", 1000);
		Product p3 = new Product("p3", 700);
		Product p4 = new Product("p4", 25);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Optional<Product> opProduct = list.stream().reduce((e,q) -> {
			return e.getPrice() < q.getPrice() ? e : q;
		});
		
		if(opProduct.isPresent()) {
			System.out.println("Product with highest price: " + opProduct.get().getName());
		}
	}
}
