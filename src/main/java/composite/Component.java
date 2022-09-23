package main.java.composite;

public class Component extends Combinable {

    public Component (String name, float price) {
        this.setName(name.toUpperCase());
        this.setPrice(price);
    }

    @Override
    public void show() {
        System.out.print(this.getName()+": $"+this.getPrice());
    }

    @Override
    public boolean add(Combinable newComponent) {
        return false;
    }

    @Override
    public boolean delete(Combinable newComponent) {
        boolean deleted = false;
        if (newComponent != null && newComponent == this) {
            deleted = true;
        }
        return deleted;
    }

    @Override
    public boolean exist(Combinable newComponent, Combinable current, boolean found) {
        if (!newComponent.isLeaf() && !found) {
            found = newComponent.exist(this, newComponent, this == newComponent);
        }else{
            found=newComponent==current;
        }
        return found;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }
}
