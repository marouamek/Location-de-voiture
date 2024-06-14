package part1_project;

public class Client {

    private String name, surname;
	private String cardNumber;
	private int rentalPeriod;
	private int phoneNumber;
	private String address;
	private String email;
	private Voiture rentedCar;
    private float rentalCost;
    
    public Client(String name ,String cardNumber, String address, String email, int phoneNumber,
    		int rentalPeriod, Voiture rentedCar,float rentalCost) {
    	
	        this.name = name;

	        this.cardNumber=cardNumber;
	        this.address = address;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.address=address;
	        this.email=email;
	        this.rentedCar=rentedCar;
	        this.rentalPeriod=rentalPeriod;
	        this.rentalCost=rentalCost;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getRentalPeriod() {
		return rentalPeriod;
	}

	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Voiture getRentedCar() {
		return rentedCar;
	}

	public void setRentedCar(Voiture rentedCar) {
		this.rentedCar = rentedCar;
	}

	public float getRentalCost() {
		return rentalCost;
	}

	public void setRentalCost(float rentalCost) {
		this.rentalCost = rentalCost;
	}
	   public float totalPrice(float rentalCost, int rentalPeriod) {
		return rentalCost*rentalPeriod;	    	
	    }
	   
	   public String toString() {
		   String reset ="\u001B[30m";
			String purple = "\u001B[35m";
	        return purple+"| "+reset+ name +purple+"       | "+reset +cardNumber +purple+"        |"+reset+  address +purple+"     | "+reset+ email +purple+"    | "+reset+ phoneNumber +purple+"      |"+reset+    rentalPeriod +purple+ "              |"+reset;
		 }
	   
	   public boolean equals(String cardNumber, String iDClient) {
		   
		   if(cardNumber == iDClient) {
			   return true;
		   }
		   return false;
}
}
