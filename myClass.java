import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

		public Doctor(int idDoctor,String name, String phone, String email, int licenseNum) {
			super(name, phone, email);
			this.license = license;
		}

		/**When information regarding a perscription is received, inputs the information into the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static String addPrescription(int idPrescription,int idDoctor, int idCustomer,int idProduct, boolean filled, String date, String expDate) {
			String sql="INSERT INTO prescription "+"VALUES("+idPrescription+','+idDoctor+','+idCustomer+','+idProduct+','+","+filled+","+"'"+date+"'"+","+"'"+expDate+"'"+")";
			return sql;
			
		}

		/**
		 * When a subscription is canceled, the information and entry is removed from the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static String removePrescription(int idPrescription) {
		String sql="delete from prescription where id ="+ idPrescription;
		return sql;
		}
	}

	/**
	 * Customer class, subclass of Person
	 *
	 */
	public static class Customer extends Person {
		int age;
		 String sex;

		public Customer(int idCustomer,String name, String phone, String email, int age, String sex) {
			super(name, phone, email);
			this.age = age;
			this.sex = sex;
		}

		/**
		 * When a new product is added to the inventory of the pharmacy, add the product to the database and it’s associated information.
		 * @param productID of the product
		 * @param name of the product
		 */
		public static String registerProduct(int productID, String name,int numInStock,double price) {
			String sql="INSERT INTO product "+"VALUES("+productID+","+"'"+name+"'"+","+numInStock+","+price+")";
			return sql;
		}

		/**
		 * When a new supplier is added, inputs the data regarding the new supplier into the database
		 * @param companyName of the supplier
		 * @param email of the supplier
		 * @param phone number of the supplier
		 * @param website of the supplier
		 */
		public static String registerSupplier(int idSupplier,String companyName, String email, String phone, String website) {
			String sql="INSERT INTO supplier "+"VALUES("+idSupplier+",'"+companyName+"',"+",'"+email+"',"+"',"+phone+",'"+"',"+website+"'"+")";
			return sql;
		}
	}

	/**
	 * Employee class, subclass of Person
	 *
	 */
	public static class Employee extends Person {
		int idEmployee;
		boolean isManager;

		public Employee(String name, String phone, String email, int idEmployee, boolean isManager) {
			super(name, phone, email);
			this.idEmployee = idEmployee;
			this.isManager = isManager;
		}

		/**
		 * When a product needs to be removed, delete the entry of the product given. 
		 * @param productID of the product
		 */
		public static String deregisterProduct(String productID) {
			String sql="delete from product where id ="+ productID;
			return sql;
		}

		/**When information regarding a perscription is received, inputs the information into the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void addPerscription(int idPrescription,int idDoctor, int idCustomer,int idProduct, boolean filled, String date, String expDate) {
			String sql="INSERT INTO supplier "+"VALUES("+idSupplier+",'"+companyName+"',"+",'"+email+"',"+"',"+phone+",'"+"',"+website+"'"+")";
			return sql;
			
		}
		/**
		 * When a subscription is canceled, the information and entry is removed from the database.
		 * @param filled status of perscription
		 * @param date filled the perscription
		 * @param expDate of the perscription
		 */
		public static void removePerscription(int idPrescription) {}

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
		int idProduct;
		int stockItem;
		String expDate;
	}

	/**
	 * product class
	 *
	 */
	public static class Product {
		int idProduct;
		String name;
		int numInStock;
		double price;
		
	}
	/**
	 * Perscription class
	 *
	 */
	public static class Perscription {
		int idDoctor;
		int idCustomer;
		int idProduct;
		int idPrescription;
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
		int idSupplier;
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
		int idEmployee;
		int idProduct;
		int quantity;
		double totalCost;
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
	public static void addCustomer(int idCustomer,String name, String phone, String email, int age, String sex) {}
	/**
	 * When a customer account is canceled by the Customer, it will remove their entry and data from the database.
	 * @param name of the customer
	 * @param phone number of the customer
	 * @param email of the customer
	 * @param age of the customer
	 * @param sex of the customer
	 */
	public static void removeCustomer(int idCustomer) {}

	/**
	 * main class
	 * @param args
	 */
	public static void main(String[] args) {
//		change url dependently
		String url ="jdbc:mysql://127.0.0.1:3306/groupassignment";
		String user ="root";
		String password ="Jokerstom123";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
