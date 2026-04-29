package com.icalonics.class_object.java_app;

import java.util.Objects;

import com.icalonics.class_object.entity.Product;

public interface JavaApp {
	public static void execution() {
		Product product1 = new Product(1, "Pen", "Apsara", 29.99);
		System.out.println(product1);
		System.out.println(Objects.toIdentityString(product1));
		
		Product product2 = new Product(1, "Pen", "Apsara", 29.99);
		System.out.println(product2);
		System.out.println(Objects.toIdentityString(product2));
		
		System.out.println(product1.equals(product2));
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}