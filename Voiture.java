package part1_project;

public class Voiture {

	private String brand;
	private String model;
	private String licensePlate;
	private String transmission;
	private String type;
	private String available;
	private String mileage;
	private int fabricationYear;
	private float price;
	public int rentalPeriod;

		public Voiture(String brand, String model, String licensePlate,int fabricationYear,String transmission,
		        	String mileage, String type, String available, String service, float price){
		
		 this.brand=brand;
		 this.model=model;
		 this.licensePlate=licensePlate;
		 this.fabricationYear=fabricationYear;
	     this.transmission=transmission;
	     this.type=type;
	     this.available=available;
	     this.mileage=mileage;
	     this.price=price;
	}
		public String getBrand() {
			return brand;
		}

		public String getModel() {
			return model;
		}

		public String getLicensePlate() {
			return licensePlate;
		}

		public String getTransmission() {
			return transmission;
		}

		public String getType() {
			return type;
		}

		public String getMileage() {
			return mileage;
		}

		public int getFabricationYear() {
			return fabricationYear;
		}

		public float getPrice() {
			return price;
		}

		public String getAvailable() {
			return available;
		}

		public void setAvailable(String available) {
			this.available = available;
		}
		public void serviceType() {
			
			 System.out.println(" Would you like to have the service with a driver?");
		}	
		public void displayAvailableCars() {
			String reset = "\u001B[0m";
			String red ="\u001B[31m";
			
			String output = red +"|"+ reset + this.brand + red +" | "+ reset + this.model +red + " | "+reset + this.licensePlate +red + " | "+reset + this.fabricationYear +red+ " | "+reset+ this.transmission +red +" | "+reset+this.mileage +red +"|"+reset+ this.type+red+"|"+reset+ this.available +red+"|"+reset+ this.price+red+"    |"+reset+"\n"+
			red+	"|------------|----------|------------------|------|----------------|------------|-------------------------|--------------|-----------|"+reset;
			System.out.println(output);
		}

		 public void rentCar() {
		        if (this.available.equalsIgnoreCase("Available")) {
		            
		            System.out.println("Car rented successfully :) ");
	        } else {
		        	
		            System.out.println("Sorry, the car is not available for rent :(");
		          
		        }
		    }

		public float totalPrice(float price2, int rentalPeriod) {
			
			return price2*rentalPeriod;
		}
		
		public float discountTotal(int d, float totalPrice ){
			return totalPrice - (totalPrice*d/100);
		}
		
		public float finalPrice( float totalPrice,int rentalPeriod1) {
			return totalPrice*rentalPeriod1;
		}
		
}