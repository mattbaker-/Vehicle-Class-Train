package Part1;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		Person a = new Person();
		
		Car car = new Car();
		car.transferOwnership(a);
		car.numberOfDoors = 4;
		
		Truck truck = new Truck();
		truck.transferOwnership(a);
		truck.numberOfAxels = 2;
		
		Person b = new Person();
		
		truck.transferOwnership(b);
		
		Motorcycle mc = new Motorcycle();
		mc.hasSideCar = false;
		
		HashMap<UUID, Vehicle> hash = new HashMap<>();
		hash.put(UUID.randomUUID(), car);
		hash.put(UUID.randomUUID(), truck);
		hash.put(UUID.randomUUID(), mc);
		
		System.out.print(hash);
	}
}
