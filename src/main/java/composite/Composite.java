package main.java.composite;

public class Composite extends Combinable {
	Combinable left;
	Combinable right;

	public Composite(String name, float price) {
		this.setName(name.toUpperCase());
		this.setPrice(price);
	}

	@Override
	public void show() {
		System.out.print(this.getName().toUpperCase() + " THAT CONTAINS => (");

		if (this.left != null) {
			this.left.show();
			if (this.right != null) {
				System.out.print(" & ");
			}
		}
		if (this.right != null) {
			this.right.show();
		}
		System.out.print(")");
	}

	@Override
	public boolean add(Combinable newComponent) {
		boolean notExist = !this.exist(newComponent, this, newComponent == this)
				&& !newComponent.exist(this, newComponent, newComponent == this);
		if (notExist) {
			if (this.left != null) {
				this.left.add(newComponent);
			}
			if (this.right != null) {
				this.right.add(newComponent);
			}
			if (this.left == null) {
				this.left = newComponent;
			} else if (this.right == null) {
				this.right = newComponent;
			}
		} else {
			System.out.println("This component has already been added, so it can't be added again.");
		}

		return notExist;
	}

	@Override
	public boolean delete(Combinable newComponent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exist(Combinable newComponent, Combinable current, boolean found) {
		if (newComponent == null) {
			found = true;
		} else if (this.left == newComponent || this == newComponent || this.right == newComponent) {
			found = true;
		}
		if (!found) {
			if (this != null) {
				if (this.left != null) {
					found = this.left.exist(newComponent, this.left, found);
				}
				if (this.right != null) {
					found = this.right.exist(newComponent, this.right, found);
				}

			}
		}
		return found;
	}

	@Override
	public boolean isLeaf() {
		return false;
	}

	

}
