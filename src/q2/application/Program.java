package q2.application;

import java.time.LocalDate;
import java.time.LocalDateTime;

import q2.entities.Client;
import q2.entities.Order;
import q2.entities.OrderItem;
import q2.entities.Product;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Alex Green", "greenalex@gmail.com", LocalDate.parse("1989-03-17"));
		
		Product p1 = new Product("TV", 1000.0);
		Product p2 = new Product("Mouse", 40.0);
		
		OrderItem oi1 = new OrderItem(2, p1);
		OrderItem oi2 = new OrderItem(4, p2);
		
		Order o1 = new Order(LocalDateTime.parse("2023-11-03T15:50:23"), "Processing", c1);
		o1.addItem(oi1);
		o1.addItem(oi2);

		System.out.println(o1);
	}

}
