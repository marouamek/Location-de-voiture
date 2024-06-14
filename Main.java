package part1_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList <Voiture> rentedCars = new ArrayList <> ();
		ArrayList<Client> registeredClients = new ArrayList<>();
		String reset ="\u001B[30m";
		String purple = "\u001B[35m";
  		String red= "\u001B[31m";
  		String blue ="\u001B[34m";
  		String yellow="\u001B[33m";
  		String green="\u001B[32m";
Voiture[] cars = {
				new Voiture("Audi       ", "A4      ","   XYZ789       ", 2020, " Automatic    ", "17.4  kmpl ", " Premium Compact         "," Available    ",  null ,   12000),
				new Voiture("Audi       ", "A6      ","   4F8G8G       ", 2020, " Automatic    ", "14.11 kmpl ", " Premium  Wagon          "," Available    ",  null ,   13000),
		        new Voiture("Audi       ", "Q7      ","   TGHH78       ", 2020, " Automatic    ", "15.3  kmpl ", " SUV                     "," Not Available",  null ,   14000),
		        new Voiture("Audi       ", "Q5      ","   4GFH78       ", 2020, " Automatic    ", "13.4  kmpl ", " SUV                     "," Available    ",  null ,   15000),
		        new Voiture("Audi       ", "R8      ","   4F8G49       ", 2020, " Automatic    ", "6.71  kmpl ", " Sports car              "," Not Available",  null ,   16000),
			
		        new Voiture("Hyundai    ", "Elantra ","   D16S15       ", 2020, " Automatic    ", "14.59 kmpl ", " Compact                 "," Available    ",  null ,   12000),
				new Voiture("Hyundai    ", "I20     ","   5BF156       ", 2020, " Automatic    ", "20.0  kmpl ", " Subcompact              "," Available    ",  null ,   13000),
				new Voiture("Hyundai    ", "I10     ","   MK1H16       ", 2020, " Automatic    ", "19.2  kmpl ", " Subcompact              "," Available    ",  null ,   14000),
				new Voiture("Hyundai    ", "Sonata  ","   23C18X       ", 2020, " Automatic    ", "13.08 kmpl ", " Hybrid                  "," Not Available",  null ,   15000),
		        
				new Voiture("Kia        ", "Picanto ","   5Q151C       ", 2020, " Manual       ", "16.8  kmpl ", " Subcompact              "," Available    ",   null ,  15000),
				new Voiture("Kia        ", "Rio     ","   23BV1N       ", 2020, " Manual       ", "23.75 kmpl ", " Subcompact              "," Available    ",   null ,  14000),
				new Voiture("Kia        ", "Sorento ","   5H6232       ", 2020, " Manual       ", "11.1  kmpl ", " Mid size SUV            "," Not Available",   null ,  13000),
				new Voiture("Kia        ", "Sportage","   R89TYY       ", 2020, " Manual       ", "12    kmpl ", " Compact SUV             "," Not Available",   null ,  12000),
				 
				new Voiture("Peugeot    ", "208     ","   A8Z79E       ", 2020, " Manual       ", "17.24 kmpL ", " Subcompact              "," Available    ",  null ,    13000),
				new Voiture("Peugeot    ", "308     ","   93QSD6       ", 2020, " Manual       ", "18.3  kmpl ", " Compact                 "," Not Available",  null ,    13000),
				
				new Voiture("Renault    ", "Sandero ","   XYZ789       ", 2020, " Manual       ", "20.0  kmpl ", " Subcompact              "," Not Available",  null ,   10000),
				new Voiture("Renault    ", "Clio 4  ","   4F8G8G       ", 2020, " Manual       ", "19.0  kmpl ", " Subcompact              "," Available    ",  null ,   14500),
		        new Voiture("Renault    ", "Duster  ","   TGHH78       ", 2020, " Manual       ", "19.87 kmpl ", " Compact Crossover SUV   "," Available    ",  null ,   11000),
		        new Voiture("Renault    ", "Logan   ","   4GFH78       ", 2020, " Manual       ", "13.8  kmpl ", " Compact                 "," Not Available",  null ,   13000),
		        new Voiture("Renault    ", "Megane  ","   4F8G49       ", 2020, " Manual       ", "20.36 kmpl ", " Compact                 "," Available    ",  null ,   12000),
				new Voiture("Renault    ", "Symbol  ","   K9G748       ", 2020, " Manual       ", "15.6  Kmpl ", " Compact                 "," Not Available",  null ,   11000),
				
				new Voiture("Seat       ", "Ibiza   ","   2FR647       ", 2020, " Automatic    ", "17.43 kmpl ", " Subcompact              "," Available    ",  null ,   14000 ),
				new Voiture("Seat       ", "Leon    ","   3U7U3G       ", 2020, " Automatic    ", "27.8  kmpl ", " Compact                 "," Not Available",  null ,   13000  ),
				new Voiture("Seat       ", "Arona   ","   T7E1N4       ", 2020, " Automatic    ", "17.86 kmpl ", " Subcompact Crossover SUV"," Not Available",  null ,   10200  ),
				
				new Voiture("Skoda      ", "Fabia   ","   CZD9D7       ", 2020, " Manual       ", "18.09 kmpl ", " Subcompact              "," Available    ",  null ,   13000  ),
				new Voiture("Skoda      ", "Rapid   ","   YU76Y8       ", 2020, " Manual       ", "14.3  kmpl ", " Compact                 "," Not Available",  null ,   10000  ),
				new Voiture("Skoda      ", "Octavia ","   XW69CW       ", 2020, " Automatic    ", "22.53 kmpl ", " Compact                 "," Available    ",  null ,   10000  ),
                                 
				new Voiture("Volkswagen ", "Tiguan  ","   3S937Q       ", 2020, " Automatic    ", "12.65 Kmpl ", " Compact Crossover SUV   " ," Available    ",  null ,  15000),
				new Voiture("Volkswagen ", "Polo    ","   WF6G98       ", 2020, " Automatic    ", "21.49 kmpl ", " Subcompact              " ," Not Available",  null ,  18000),
		        new Voiture("Volkswagen ", "Golf R  ","   POKLM6       ", 2020, " Automatic    ", "12.33 kmpl ", " Compact                 " ," Available    ",  null ,  17000),
		        new Voiture("Volkswagen ", "Caddy   ","   RE6397       ", 2020, " Automatic    ", "18.71 kmpl ", " Compact MPV             " ," Not Available",  null ,  16000),
		        new Voiture("Volkswagen ", "Golf 7  ","   3ER4T4       ", 2020, " Automatic    ", "13.33 kmpl ", " Compact                 " ," Not Available",  null ,  19000),
		        	
		};

           registeredClients = new ArrayList<>(List.of(
        		new Client("John Doe       ","1234567890123", "123 Main St  ", "john.doe@gmail.com       ", 123456789,6, new Voiture("Audi       ", "Q7      ","   TGHH78       ", 2020, " Automatic    ", "15.3  kmpl ", " SUV                     "," Not Available",  null ,  14000), 0),
   				new Client("Jane Smith     ","9876543210345", "456 Oak St   ", "jane.smith@yahoo.fr      ", 987654321,4, new Voiture("Audi       ", "R8      ","   4F8G49       ", 2020, " Automatic    ", "6.71  kmpl ", " Sports car              "," Not Available",  null ,  16000), 0),
   				new Client("Robert Johnson ","1357902468135", "789 Pine St  ", "robert.johnson@gmail.com ", 565648793,6, new Voiture("Hyundai    ", "Sonata  ","   23C18X       ", 2020, " Automatic    ", "13.08 kmpl ", " Hybrid                  "," Not Available",  null ,  15000), 0),
   				new Client("Alice Johnson  ","2468013579012", "321 Elm St   ", "alice.johnson@gmail.com  ", 978564231,1, new Voiture("Kia        ", "Sorento ","   5H6232       ", 2020, " Manual       ", "11.1  kmpl ", " Mid size SUV            "," Not Available",  null , 13000) , 0),
   				new Client("Bob Williams   ","5678901234567", "567 Birch St ", "bob.williams@gmail.com   ", 978922984,2, new Voiture("Peugeot    ", "308     ","   93QSD6       ", 2020, " Manual       ", "18.3  kmpl ", " Compact                 "," Not Available",  null ,  2300 ), 0),
   		        new Client("Eva Davis      ","1098745632109", "876 Maple St ", "eva.davis@gmail.com      ", 165463547,3, new Voiture("Kia        ", "Sportage","   R89TYY       ", 2020, " Manual       ", "12    kmpl ", " Compact SUV             "," Not Available",  null , 12000) , 0),
   		        new Client("Michael Brown  ","9870123456789", "432 Pine St  ", "michael.brown@gmail.com  ", 336295824,1, new Voiture("Renault    ", "Sandero ","   XYZ789       ", 2020, " Manual       ", "20.0  kmpl ", " Subcompact              "," Not Available",  null ,  10000), 0),
   		        new Client("Sophia White   ","5432109876543", "654 Cedar St ", "sophia.white@gmail.com   ", 425789754,2, new Voiture("Renault    ", "Logan   ","   4GFH78       ", 2020, " Manual       ", "13.8  kmpl ", " Compact                 "," Not Available",  null ,  13000), 0),
   		        new Client("Oliver Miller  ","7654321980123", "789 Walnut St", "oliver.miller@gmail.com  ", 431254678,4, new Voiture("Renault    ", "Symbol  ","   K9G748       ", 2020, " Manual       ", "15.6  Kmpl ", " Compact                 "," Not Available",  null ,  15000), 0),
   		        new Client("David Johnson  ","4321098765432", "876 Elm St   ", "david.johnson@yahoo.fr   ", 555555555,5, new Voiture("Seat       ", "Leon    ","   3U7U3G       ", 2020, " Automatic    ", "27.8  kmpl ", " Compact                 "," Not Available",  null ,  3000 ), 0),
   		        new Client("Sophie Martinez","8901234567012", "987 Oak St   ", "sophie.martinez@yahoo.fr ", 734651894,6, new Voiture("Seat       ", "Arona   ","   T7E1N4       ", 2020, " Automatic    ", "17.86 kmpl ", " Subcompact Crossover SUV"," Not Available",  null ,  8200 ), 0),
   		        new Client("Jackson Harris ","6789012345123", "654 Maple St ", "jackson.harris@gmail.com ", 889764231,4, new Voiture("Skoda      ", "Rapid   ","   YU76Y8       ", 2020, " Manual       ", "14.3  kmpl ", " Compact                 "," Not Available",  null ,  6000 ), 0),
   		        new Client("Emma Turner    ","3210987654789", "765 Birch St ", "emma.turner@gmail.com    ", 114257789,3, new Voiture("Volkswagen ", "Polo    ","   WF6G98       ", 2020, " Automatic    ", "21.49 kmpl ", " Subcompact              "," Not Available",  null ,  18000), 0),
   		        new Client("Aiden Baker    ","8765432109123", "876 Cedar St ", "aiden.baker@gmail.com    ", 553226459,7, new Voiture("Volkswagen ", "Caddy   ","   RE6397       ", 2020, " Automatic    ", "18.71 kmpl ", " Compact MPV             "," Not Available",  null ,  16000), 0),
   		        new Client("Isabella Clark ","3145926871023", "987 Pine St  ", "isabella.clark@yahoo.fr  ", 458792131,4, new Voiture("Volkswagen ", "Golf 7  ","   3ER4T4       ", 2020, " Automatic    ", "13.33 kmpl ", " Compact                 "," Not Available",  null ,  19000), 0))
        	   
   		);

           for(int i=0; i< cars.length; i++) {
	         if("Not Available".trim().equalsIgnoreCase(cars[i].getAvailable().trim())) {
		        rentedCars.add(cars[i]);
		      }
           }
         boolean exit = false;
         
        System.out.println(blue+"\n____________________________________________________________________________________________________________________________________-________");
   		System.out.println(green+"\n********************************************************"+reset+" Welcome to DriveHub Rentals "+green+"******************************************************** ");
   		System.out.println(blue+"\n________________________________________________________________________________________________________________________________________-_____");
        
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n                          "+green+"======"+reset+" Is this your first time renting from DriveHub Rentals ? "+red+"(yes/no)"+green+" ========="+purple);
	    String response = scanner.nextLine().toLowerCase();
	    
	  if (response.equals("no")) {
        	System.out.println("         "+green+"==="+reset+" Enter your card number please"+green+" ===      "+purple);
      		String cardnum = scanner.next();
      	
      		
      		System.out.println(blue+"\n _____________________________________________________________________________________________________________________________________ ");
      		System.out.println(green+"\n *************************************************************"+reset+" Registred Clients"+green+" ************************************************************* \n ");
      		System.out.println(blue+" _______________________________________________________________________________________________________________________________________ \n");
      		System.out.println(purple+"___________________________________________________________________________________________________________________________________");
      		System.out.println(purple+"|"+yellow+"         CLIENT        "+purple+"|"+yellow+"      CARD NUMBER     "+purple+"|"+yellow+"      ADRESS      "+purple+"|"+yellow+"             EMAIL            "+purple+"|"+yellow+"  PHONE NUMBER  "+purple+"|"+yellow+" RENTAL PERIOD "+purple+"|");
      		System.out.println(purple+"|_______________________|______________________|__________________|______________________________|________________|_______________|");
      		                  
      		for (int  i=0; i<registeredClients.size(); i++) {
	                System.out.println(registeredClients.get(i).toString());
	            }
      		 
	        System.out.println(purple+"|_______________________|______________________|__________________|______________________________|________________|_______________| \n"+reset);
	        
	        for (int i = 0; i < registeredClients.size(); i++) {
	        	    Client currentClient = registeredClients.get(i);
	        	    if (currentClient.getCardNumber().trim().equalsIgnoreCase(cardnum.trim())) {
	        	        System.out.println(green+"   Welcome to DriveHub Renatls Mr/Mrs. "+reset+purple + currentClient.getName()+reset);
	        	        break;
	        	    }
	        }
	        
	        while (!exit) {
	              System.out.println(red+"\n============================================================="+reset+" Car Rental System "+red+"===================================================== \n"+reset);
	              System.out.println(green+"       1. "+yellow+"Rent a Car ");
	              System.out.println(green+"       2. "+yellow+"Return a Car ");		        
             	  System.out.println(green+"       3. "+yellow+"Display Our Cars ");
	              System.out.println(green+"       4. "+yellow+"Exit "+reset);
	              System.out.println(green+"\n        Please enter the number you choosed  : \n"+reset);
	              System.out.println(purple);
	              int answer = scanner.nextInt();
	              
	              switch(answer) {		 		     
			         case 1:
			        	 
			        	 float rentalCost =0; 
			        	 boolean carFound = false;
			             Voiture selectedCar = null;
			             
			             System.out.println(green+"                                                            ==== "+reset+"Rent a Car "+green+"====            \n");
			             System.out.println(red+"____________________________________________________________________________________________________________________________________");
			          	 System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
			          	 System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
			               	
			             for(int i=0; i< cars.length; i++) {
			            		cars[i].displayAvailableCars();
			            		}
			             System.out.println(green+"\n                            =================="+reset+" Please select the license plate of the car from the displayed list :"+green+" ==================");		            
			             System.out.println(purple);
			             String selectedLicensePlate = scanner.next();	
			             
			             for(int i=0; i< cars.length; i++) {	   
		            		  if (cars[i].getLicensePlate().trim().equalsIgnoreCase(selectedLicensePlate.trim())) {		            				            			 
		            			  carFound = true;	
		            			  selectedCar=cars[i];
			            		  break;
		            		  }
		            	  }
			             if (carFound==true) {
			            	 System.out.println(green+"  The selected car : "+red+selectedCar.getBrand().trim()+blue+"||"+red+ selectedCar.getModel().trim()+blue+"||"+red+ selectedCar.getLicensePlate().trim() + blue+"||" +red+ selectedCar.getFabricationYear()+blue+"||"+ red+selectedCar.getTransmission().trim()+blue+"||"+red+ selectedCar.getMileage().trim()+blue+"||"+red+ selectedCar.getType().trim()+blue+"||"+red+ selectedCar.getAvailable().trim()+blue+"||"+red+selectedCar.getPrice());
	            			 System.out.println(green+"\n ===="+reset+" Do you want to rent this car?"+red+" (Enter 'yes' or 'no') "+green+"==== \n"+purple);
	            			 String rentChoice = scanner.next();
	            			 System.out.println(green+" \n ==="+reset+" For how many days you want to rent this car? : "+green+"=== \n"+purple);
	            			 int rentalPeriod = scanner.nextInt();
	            			 
	            			 if ("yes".equalsIgnoreCase(rentChoice)) {              				
           			              if ("Available".trim().equalsIgnoreCase(selectedCar.getAvailable().trim())) {
    			                      rentedCars.add(selectedCar);
    			                      rentalCost =selectedCar.totalPrice(selectedCar.getPrice(),rentalPeriod);
    			                     
    			                      selectedCar.setAvailable("Not Available ");
    			                      System.out.println(green+"\n                                                      === "+reset+"ADDING THE LAST RENTED CAR "+green+"==="+purple);
    			                      System.out.println(red+"____________________________________________________________________________________________________________________________________");
    						          System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
    						          System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
    			                     
    						          for(int i=0; i< rentedCars.size(); i++) {
    			                      rentedCars.get(i).displayAvailableCars();
    			                      }
    						         
    						          int d=10;
    			                      System.out.println(yellow+"\n                                             ==="+green+" Rental successful "+yellow+"====");
    			                      System.out.println(red+"\n____________________________________________________________________________________________________________________________________________");
     			                      System.out.println("\n                                                ==="+reset+"   PAYMENT "+red+"  ====");
     			                      System.out.println("\n          ###"+purple+" We're thrilled to share some exciting news with you— each time you rent a car you would have a discount !!"+red+" ###");
     			                      System.out.println(green+"\n                   Congratulations on this well-deserved reward! We appreciate your continued support,\n"
     			                      		+ "                                 and we're delighted to offer you"+red+" [10]%"+green+" off on your  purchase.\n "
     			                      		+ "                      This is our way of saying thank you for being a valued part of our community"+red+" :))");
     			                     System.out.println(blue+"\n-----------------------------------------------------------------------------------------------------------------------------------------------");
     			                      System.out.println(green+"     ===================================================="+reset+" TOTAL"+green+" =================================================== \n\n "
     			                                            +purple+ "    WITHOUT DISCOUNT.      "  +blue+ selectedCar.getPrice()                            +"\n "+
     			                                             purple+ "    WITH DISCOUNT.         "  +blue+ selectedCar.discountTotal(d,selectedCar.getPrice()));
     			                      System.out.println(reset+"     ----------------------------------------------");
     			                      System.out.println(purple+"     Your Total is :        "  +red+selectedCar.finalPrice( selectedCar.discountTotal(d,selectedCar.getPrice()),rentalPeriod));
     			                      System.out.println("\n_______________________________________________________________________________________________________________________________________________");
           			                  System.out.println(yellow+"\n THANK YOU FOR YOUR LOVELY VISIT!!! Hope to see you in the near future.\n\n");
           			                  
           			              }else {
            			              System.out.println(yellow+"\n                                                ==="+red+" Rental canceled"+yellow+" ===");
            			             }
	            			 } else {
	            			        System.out.println(red+"Rental canceled.");
	            			    }
	            		 } else {
		            			    System.out.println(reset+"Car with license plate " + selectedLicensePlate + red+" not found.");
		            			}	             
			             break;
			             
			         case 2:
			        	 Voiture selectedCar1 = null;
			        	 boolean carFound1=false;
			             System.out.println(green+"                                                            ==== "+reset+"Return a Car "+green+"====            \n");
			        	 
			        	  System.out.println(red+"____________________________________________________________________________________________________________________________________");
				          System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
				          System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
	                     
			        	 for(int i=0; i< rentedCars.size(); i++) {
		                      rentedCars.get(i).displayAvailableCars();
		                      }
			        	
			             System.out.println(green+"\n                            =================="+reset+" Please select the license plate of the car you want to retur from displayed list :"+green+" ==================");		            
			            System.out.println(purple);
			             String selectedLicensePlate1 = scanner.next();	
			             
			             for(int i=0; i< rentedCars.size(); i++) {	   
		            		  if (rentedCars.get(i).getLicensePlate().trim().equalsIgnoreCase(selectedLicensePlate1.trim())) {		            				            			 
		            			  carFound1 = true;	
		            			  selectedCar1=rentedCars.get(i);
			            		  break;
		            		  }
		            	  }
			             if (carFound1==true) {
			            	 System.out.println(green+"  The selected car : "+red+selectedCar1.getBrand().trim()+blue+"||"+red+ selectedCar1.getModel().trim()+blue+"||"+red+ selectedCar1.getLicensePlate().trim() + blue+"||" +red+ selectedCar1.getFabricationYear()+blue+"||"+ red+selectedCar1.getTransmission().trim()+blue+"||"+red+ selectedCar1.getMileage().trim()+blue+"||"+red+ selectedCar1.getType().trim()+blue+"||"+red+ selectedCar1.getAvailable().trim()+blue+"||"+red+selectedCar1.getPrice());
	            			 System.out.println(green+"\n ===="+reset+" Do you want to return this car?"+red+" (Enter 'yes' or 'no') "+green+"==== \n"+purple);
	            			 String rentChoice = scanner.next();
	            			 if ("yes".equalsIgnoreCase(rentChoice)) {              				
           			              if ("Not Available".trim().equalsIgnoreCase(selectedCar1.getAvailable().trim())) {
    			                      rentedCars.remove(selectedCar1);
    			                      selectedCar1.setAvailable("Available ");
    			                      System.out.println(green+"\n                                                      === "+reset+"REMOVING THE LAST RENTED CAR "+green+"==="+purple);

    			                      System.out.println(red+"____________________________________________________________________________________________________________________________________");
    						          System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
    						          System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
    			                     
    						          for(int i=0; i< rentedCars.size(); i++) {
    			                      rentedCars.get(i).displayAvailableCars();
    			                      }
    						          
    			                      System.out.println(yellow+"\n                                             ==="+green+" Return successful "+yellow+"====");

           			              }else {
            			              System.out.println(yellow+"\n                                                ==="+red+" Return canceled"+yellow+" ===");

            			             }
	            			 } else {
	            				    System.out.println(red+"  Return canceled.");
	            			        
	            			    }
	            		 } else {
		            			    System.out.println(reset+"Car with license plate " + selectedLicensePlate1 +red+ " not found.");
		            			}	             
			             break;
			         case 3:

			        	    System.out.println(blue+"\n _____________________________________________________________________________________________________________________________________ "+reset);
			          		System.out.println(red+"\n ************************************************************* "+reset+"Car Rental System"+red+" ************************************************************* \n ");
			          		System.out.println(blue+" _____________________________________________________________________________________________________________________________________ \n");
			          		System.out.println(red+"____________________________________________________________________________________________________________________________________");
					        System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
					        System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
		                     
			            	  for(int i=0; i< cars.length; i++) {				            		  
			            		cars[i].displayAvailableCars();
			            	  }
			         break;
			         case 4:
			        	    System.out.println(green+ "   Exiting the program. Goodbye!"); 
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println(red+ "  Invalid choice. Please enter a number between 1 and 4.");
	              
	              }// switch end
	        }//while end
	    }else { // case where the client is not registred
	    	System.out.println(red+ "\n   You are not registered. You can proceed with the registration process :");
	    	
	    	System.out.println(yellow+" --- "+green+"Please enter your full name"+yellow+" ---");
	    	System.out.println(yellow+" === "+green+"First name"+yellow+" ===  "+purple);
            String name=scanner.next();
            System.out.println(yellow+" === "+green+"Second name"+yellow+" ===  "+purple);            
            String surname=scanner.next();
            
            System.out.println(yellow+" --- "+green+"Please enter your Card Number"+yellow+" ---"+purple);            
            String cardnumber =scanner.next();
            
            System.out.println(yellow+" --- "+green+"Please enter your address"+yellow+" ---"+purple); 
            String address=scanner.next();
            
            System.out.println(yellow+" --- "+green+"Please enter your email"+yellow+" ---"+purple); 
            String email=scanner.next();
            
            System.out.println(yellow+" --- "+green+"Please enter your phone number"+yellow+" ---"+purple); 
            int phoneNumber = scanner.nextInt();
            
            System.out.println(yellow+" --- "+green+"Please enter your rental period"+yellow+" ---"+purple); 
            int rentalPeriod=scanner.nextInt();
            
            System.out.println( green+"    Welcome to the DriveHub Rentals Mr/Mrs."+ name +" "+surname);
            
            while (!exit) {
            	 System.out.println(red+"\n============================================================="+reset+" Car Rental System "+red+"===================================================== \n"+reset);
	              System.out.println(green+"       1. "+yellow+"Rent a Car ");	             		        
            	  System.out.println(green+"       2. "+yellow+"Display Our Cars ");
	              System.out.println(green+"       3. "+yellow+"Exit "+reset);
	              System.out.println(green+"\n        Please enter the number you choosed  : \n"+reset);
	              System.out.println(purple);
	              int answer = scanner.nextInt();
	              switch(answer) {		 		     
			         case 1:
                          
			        	 String full=name+" "+surname;
			        	 float rentalCost =0;
			        	 boolean carFound = false;
			             Voiture selectedCar = null;
			             
			             System.out.println(green+"                                                            ==== "+reset+"Rent a Car "+green+"====            \n");
			             System.out.println(red+"____________________________________________________________________________________________________________________________________");
			          	 System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
			          	 System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
			               	
			             for(int i=0; i< cars.length; i++) {
			            		cars[i].displayAvailableCars();
			            		}
			             System.out.println(green+"\n                            =================="+reset+" Please select the license plate of the car from the displayed list :"+green+" ==================");		            
			             System.out.println(purple);
			             String selectedLicensePlate = scanner.next();	
			             
			             for(int i=0; i< cars.length; i++) {	   
		            		  if (cars[i].getLicensePlate().trim().equalsIgnoreCase(selectedLicensePlate.trim())) {		            				            			 
		            			  carFound = true;	
		            			  selectedCar=cars[i];
			            		  break;
		            		  }
		            	  }
			             if (carFound==true) {
			            	 System.out.println(green+"  The selected car : "+red+selectedCar.getBrand().trim()+blue+"||"+red+ selectedCar.getModel().trim()+blue+"||"+red+ selectedCar.getLicensePlate().trim() + blue+"||" +red+ selectedCar.getFabricationYear()+blue+"||"+ red+selectedCar.getTransmission().trim()+blue+"||"+red+ selectedCar.getMileage().trim()+blue+"||"+red+ selectedCar.getType().trim()+blue+"||"+red+ selectedCar.getAvailable().trim()+blue+"||"+red+selectedCar.getPrice());
	            			 System.out.println(green+"\n ===="+reset+" Do you want to rent this car?"+red+" (Enter 'yes' or 'no') "+green+"==== \n"+purple);
	            			 String rentChoice = scanner.next();
	            			 System.out.println(green+" \n ==="+reset+" For how many days you want to rent this car? : "+green+"=== \n"+purple);
	            			 
	            			 if ("yes".equalsIgnoreCase(rentChoice)) {              				
        			              if ("Available".trim().equalsIgnoreCase(selectedCar.getAvailable().trim())) {
 			                         
        			            	  rentedCars.add(selectedCar);
 			                          selectedCar.setAvailable("Not Available ");
 			                          rentalCost =selectedCar.totalPrice(selectedCar.getPrice(),rentalPeriod);
 			                          Client newClient =  new Client( full             , cardnumber    ,  address           ,  email                         , phoneNumber    ,  rentalPeriod  ,selectedCar, rentalCost );
      			                      registeredClients.add(newClient);
    			               
      			                System.out.println(green+"\n                                                      === "+reset+"ADDING THE LAST REGISTRED CLIENT "+green+"==="+purple);
      			                System.out.println(blue+" _______________________________________________________________________________________________________________________________________ \n");
      			        		System.out.println(purple+"___________________________________________________________________________________________________________________________________");
      			        		System.out.println(purple+"|"+yellow+"         CLIENT        "+purple+"|"+yellow+"      CARD NUMBER     "+purple+"|"+yellow+"      ADRESS      "+purple+"|"+yellow+"             EMAIL            "+purple+"|"+yellow+"  PHONE NUMBER  "+purple+"|"+yellow+" RENTAL PERIOD "+purple+"|");
      			        		System.out.println(purple+"|_______________________|______________________|__________________|______________________________|________________|_______________|");
      			        		                  
      			        		  
      			        		   for (int  i=0; i<registeredClients.size(); i++) {
      				                System.out.println(registeredClients.get(i).toString());
      				            } 
      			        		   
      			        		 System.out.println(green+"\n                                                      === "+reset+"ADDING THE LAST RENTED CAR "+green+"==="+purple);
			                      System.out.println(red+"____________________________________________________________________________________________________________________________________");
						          System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
						          System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
			                     
						          for(int i=0; i< rentedCars.size(); i++) {
			                      rentedCars.get(i).displayAvailableCars();
			                      }
						         
						          int d=30;
			                      System.out.println(yellow+"\n                                             ==="+green+" Rental successful "+yellow+"====");
			                      System.out.println(red+"\n____________________________________________________________________________________________________________________________________________");
			                      System.out.println("\n                                                ==="+reset+"   PAYMENT "+red+"  ====");
			                      System.out.println("\n          ###"+purple+" We're thrilled to share some exciting news with you— each time you rent a car you would have a discount !!"+red+" ###");
 			                      System.out.println(green+"\n                   Congratulations on this well-deserved reward! We appreciate your continued support,\n"
 			                      		+ "                                 and we're delighted to offer you"+red+" [30]%"+green+" off on your  purchase.\n "
 			                      		+ "                      This is our way of saying thank you for being a valued part of our community"+red+" :))");
			                      System.out.println(blue+"\n-----------------------------------------------------------------------------------------------------------------------------------------------");
			                      System.out.println(green+"     ===================================================="+reset+" TOTAL"+green+" =================================================== \n\n "
			                                            +purple+ "    WITHOUT DISCOUNT.      "  +blue+ selectedCar.getPrice()                            +"\n "+
			                                             purple+ "    WITH DISCOUNT.         "  +blue+ selectedCar.discountTotal(d,selectedCar.getPrice()));
			                      System.out.println(reset+"     ----------------------------------------------");
			                      System.out.println(purple+"     Your Total is :        "  +red+selectedCar.finalPrice( selectedCar.discountTotal(d,selectedCar.getPrice()),rentalPeriod));
			                      System.out.println("\n_______________________________________________________________________________________________________________________________________________");
      			                  System.out.println(yellow+"\n THANK YOU FOR YOUR LOVELY VISIT!!! Hope to see you in the near future.\n\n");
      			                  
        			              }else {
            			              System.out.println(yellow+"\n                                                ==="+red+" Rental canceled"+yellow+" ===");
            			             }
	            			 } else {
	            			        System.out.println(red+"Rental canceled.");
	            			    }
	            		 } else {
		            			    System.out.println(reset+"Car with license plate " + selectedLicensePlate + red+" not found.");
		            			}	             
			             break;
			             
			         case 2:
			        	 System.out.println(blue+"\n _____________________________________________________________________________________________________________________________________ "+reset);
			          		System.out.println(red+"\n ************************************************************* "+reset+"Car Rental System"+red+" ************************************************************* \n ");
			          		System.out.println(blue+" _____________________________________________________________________________________________________________________________________ \n");
			          		System.out.println(red+"____________________________________________________________________________________________________________________________________");
					        System.out.println(red+"|"+purple+"   BRAND    "+red+"|"+purple+"   MODEL  "+red+"|"+purple+"   License PLATE  "+red+"|"+purple+" YEAR "+red+"|"+purple+"  TRANSMISSSION "+red+"|"+purple+"  MILEAGE   "+red+"|"+purple+"           TYPE          "+red+"|"+purple+"   STATE      "+red+"|"+purple+"   PRICE   "+red+"|  ");
					        System.out.println(red+"|____________|__________|__________________|______|________________|____________|_________________________|______________|___________|  "+reset);
		                     
			            	  for(int i=0; i< cars.length; i++) {				            		  
			            		cars[i].displayAvailableCars();
			            	  }
			         break;
			         case 3:
			        	    System.out.println(green+ "   Exiting the program. Goodbye!"); 
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println(red+ "  Invalid choice. Please enter a number between 1 and 3.");
		               
	              }//switch end
	              
            }//while end
            
	    }//else end big
	    
	}
}
