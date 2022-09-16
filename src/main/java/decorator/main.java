package main.java.decorator;

public class main {

	public static void main(String[] args) {
		
		Item skateboard = new Item ("Skateboard","TLS-3108",15.99f);
		DiscountedItem cheaperSkateboad = new DiscountedItem(skateboard,50);
		System.out.println("Skateboard price with discount $"+cheaperSkateboad.getPrice()+".");
		System.out.println("Skateboard regular price $"+skateboard.getPrice()+".");

	}

}
