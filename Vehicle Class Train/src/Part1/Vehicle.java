package Part1;

public abstract class Vehicle {
	
	String name;
	String color;
	Double weight;
	Person owner;
	
	void transferOwnership(Person newOwner) {
		this.owner = newOwner;
	}
}
