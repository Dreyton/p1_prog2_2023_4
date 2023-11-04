package q2.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDateTime moment;
	private String status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order(LocalDateTime moment, String status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double total = 0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status + ", client=" + client + ", items=" + items
				+ ", total()=" + total() + "]";
	}
	
}
