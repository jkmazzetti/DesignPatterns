package main.java.decorator;

public class Decorator extends Item {
	Item item;
	public Decorator(Item item) {
		super(item.getName(), item.getDescription(), item.getPrice());
		this.item = item;
	}

}
