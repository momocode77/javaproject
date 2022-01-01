
public class Car extends Vehicle{
	
	private int capacity;
	private double price;
	
	Car(String vehicleType, String model, double petrolVolume, int capacity, double price) {
		
		super(vehicleType, model, petrolVolume);
		this.capacity = capacity;
		this.price = price;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}
	

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
	public double calculateDistance() {
		
		double distance = petrolVolume*7;
		return distance;
		
	}
	
	public void printInfo() {
		
		
		super.printInfo();
		System.out.println("Capacity of this Vehicle is :" +capacity);
		System.out.println("Price of this Vehicle is:" +price);
		System.out.println("Distance for maximum petrol volume is :" +distance);
	}
	
	
}
