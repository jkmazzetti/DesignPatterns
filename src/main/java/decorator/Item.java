package main.java.decorator;

public class Item {
	private String name;
	private String description;
	private float price;

	public Item(String name, String description, float price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}
	public void setPrice(float newPrice) {
		this.price=newPrice;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
}
