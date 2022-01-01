
public class Vehicle {
	
	protected String vehicleType;
	protected String model;
	protected double petrolVolume;

	

	Vehicle(String vehicleType, String model, double petrolVolume){
		
		this.vehicleType = vehicleType;
		this.model = model;
		this.petrolVolume = petrolVolume;
	}
	
	
	
	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPetrolVolume() {
		return petrolVolume;
	}

	public void setPetrolVolume(double petrolVolume) {
		this.petrolVolume = petrolVolume;
	}
	
	
	public void printInfo() {
		
		System.out.println("Type of this Vehicle is :" +vehicleType);
		System.out.println("Model of this Vehicle is :" +model);
		System.out.println("Petrol Volume of this Vehicle is :" +petrolVolume);
	}




}
