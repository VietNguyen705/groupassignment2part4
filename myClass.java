/**
 * 
 * The program skeleton
 * @author Viet Nguyen
 * @author Shichun nie
 * @author Nickolas Hessler
 * @author Mason Nash
 * @author Joshua Pao
 */

public class myClass {
	/**
	 * Person superclass
	 *
	 */
	public static class Person {
		String name;
		String phone;
		String email;

		public Person(String name, String phone, String email) {
			super();
			this.name = name;
			this.phone = phone;
			this.email = email;
		}

	}

	/**
	 * Doctor class, subclass of Person
	 *
	 */
	public static class Doctor extends Person {
		int license;

		public Doctor(String name, String phone, String email, int license) {
			super(name, phone, email);
			this.license = license;
		}

		/**When information regarding a perscription is received, inputs the information into the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void addPerscription(boolean filled, String date, String expDate) {}

		/**
		 * When a subscription is canceled, the information and entry is removed from the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void removePerscription(boolean filled, String date, String expDate) {}

	}

	/**
	 * Customer class, subclass of Person
	 *
	 */
	public static class Customer extends Person {
		int age;
		 String sex;

		public Customer(String name, String phone, String email, int age, String sex) {
			super(name, phone, email);
			this.age = age;
			this.sex = sex;
		}

		/**
		 * When a new product is added to the inventory of the pharmacy, add the product to the database and it’s associated information.
		 * @param productID of the product
		 * @param name of the product
		 */
		public static void registerProduct(String productID, String name) {}

		/**
		 * When a new supplier is added, inputs the data regarding the new supplier into the database
		 * @param companyName of the supplier
		 * @param email of the supplier
		 * @param phone number of the supplier
		 * @param website of the supplier
		 */
		public static void registerSupplier(String companyName, String email, String phone, String website) {}
	}

	/**
	 * Employee class, subclass of Person
	 *
	 */
	public static class Employee extends Person {
		int ID;
		boolean isManager;

		public Employee(String name, String phone, String email, int ID, boolean isManager) {
			super(name, phone, email);
			this.ID = ID;
			this.isManager = isManager;
		}

		/**
		 * When a product needs to be removed, delete the entry of the product given. 
		 * @param productID of the product
		 */
		public static void deregisterProduct(String productID) {}

		/**When information regarding a perscription is received, inputs the information into the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void addPerscription(boolean filled, String date, String expDate) {}
		/**
		 * When a subscription is canceled, the information and entry is removed from the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void removePerscription(boolean filled, String date, String expDate) {}

		/**
		 * When a customer picks up their medical product, an Employee registers that they have collected their product.
		 * @param productID of the product
		 * @return the status of whether the product was picked up or not
		 */
		public static boolean pickUpProduct(String productID) {
			return true;
		}
	}

	/**
	 * Stock item class
	 *
	 */
	public static class StockItem {
		String expDate;
	}

	/**
	 * product class
	 *
	 */
	public static class Product {
		String name;
	}
	/**
	 * Perscription class
	 *
	 */
	public static class Perscription {
		boolean filled;
		String date;
		String expDate;
	}
	/**
	 * Offering class
	 *
	 */
	public static class Offering {
		Double price;
	}
	/**
	 * Suppplier class
	 *
	 */
	public static class Suppplier {
		String companyName;
		String email;
		String phone;
		String website;

		/**
		 * When a product needs to be removed, delete the entry of the product given. 
		 * @param productID of the product
		 */
		public static void deregisterProduct(String productID) {}
		/**
		 * When the product is shipped, change the information regarding the shipping status
		 * @param productID of the product
		 */
		public static void updateShippingStatus(String productID) {}
	}
	/**
	 * Order class
	 *
	 */
	public static class Order {
		String datePlaced;
		String dateReceived;

	}
	/**
	 * Order Entry class
	 *
	 */
	public static class OrderEntry {
		int quantity;
		Double Price;
	}

	/**
	 * When the inventory stock is low, the System orders more products to ensure it remains in stock.
	 * @param productID of the product
	 */
	public static void orderItem(String productID) {}
	/**
	 * When the System detects that the product’s expiration date has passed, mark the current inventory as expired and needing replacement
	 * @param productID of the product
	 */
	public static void markExpired(String productID) {}

	/**
	 * When a subscription has a new customer, the System will register the customer into the database.
	 * @param name of the customer
	 * @param phone number of the customer
	 * @param email of the customer
	 * @param age of the customer
	 * @param sex of the customer
	 */
	public static void addCustomer(String name, String phone, String email, int age, String sex) {}
	/**
	 * When a customer account is canceled by the Customer, it will remove their entry and data from the database.
	 * @param name of the customer
	 * @param phone number of the customer
	 * @param email of the customer
	 * @param age of the customer
	 * @param sex of the customer
	 */
	public static void removeCustomer(String name, String phone, String email, int age, String sex) {}

	/**
	 * main class
	 * @param args
	 */
	public static void main(String[] args) {
		Customer asd = new Customer("harry", "!23", "asdfads@fasd", 5, "girls");
		System.out.println(asd.name);
		System.out.println(asd.age);
		System.out.println(asd.phone);
		System.out.println(asd.sex);
		System.out.println(asd.email);
	}
}
