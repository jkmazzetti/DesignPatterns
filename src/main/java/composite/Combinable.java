package main.java.composite;

public abstract class Combinable {
	private String name;
	private float price;

	public abstract void show();
    public abstract boolean add(Combinable newComponent);
    public abstract boolean delete(Combinable newComponent);
    public abstract boolean exist(Combinable newComponent, Combinable current, boolean found);
    public abstract boolean isLeaf();
    public void setName(String name) {
		this.name = name;
	}
    public void setPrice(float price) {
		this.price = price;
	}
    public String getName() {
		return name;
	}
    public float getPrice() {
		return price;
	}
}
