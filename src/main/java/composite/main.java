package main.java.composite;

public class main {
	
	public static void main(String args[]) {
		Component cellphone = new Component("Cellphone",150.99f);
		Component manual = new Component("Manual",0.00f);
		Component ticket = new Component("Ticket",150.99f);
		Composite littleBox = new Composite("Little Box",0.00f);
		Composite bag = new Composite("Bag",0.00f);
		Composite bigBox = new Composite("Big Box",0.00f);
		littleBox.add(cellphone);
		littleBox.add(manual);
		bigBox.add(bag);
		bag.add(littleBox);
		bag.add(ticket);
		littleBox.add(bag);
		bag.show();

	}
}
