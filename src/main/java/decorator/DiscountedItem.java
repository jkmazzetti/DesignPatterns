package main.java.decorator;

/*
discount > 0 and discount < 100
*/
public class DiscountedItem extends Decorator {
	Item item;
	float discount;

	public DiscountedItem(Item item, float discount) {
		super(item);
		this.item = item;
		this.setPrice(Math.round(this.getPrice() * discount / 100));
	}

	/*
	 * discount > 0 and discount < 100
	 */
	public void setDiscount(float discount) {
		this.setPrice(Math.round(this.getPrice() * discount / 100));
	}

}
