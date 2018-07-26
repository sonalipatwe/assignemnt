import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class RetailStore{

public static void main(String agrs[]) {
	System.out.println("****Welcome to the Retail Store****");
	
	try {
	System.out.println("Enter User ID ");
	Scanner sc=new Scanner(System.in);
	String id =sc.next();

	
	FileInputStream fi = new FileInputStream(new File("Users.txt"));
	ObjectInputStream oi = new ObjectInputStream(fi);

	User user = new User();
	HashMap<String, Integer> itemsList = new HashMap<String,Integer>();
	System.out.println(user.toString());
	
	oi.close();
	fi.close();
	}catch(Exception e) {
		
	}
	do {
	System.out.println("Enter item id");
	Scanner sc=new Scanner(System.in);
	String itemId = sc.next();
	System.out.println("Enter quantity");
	Scanner sc1=new Scanner(System.in);
	int qty = sc1.nextInt();
	}while(true);
	
}
}
class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Date userEnrollmentDate;
	private Double discount;
	private Boolean isEmployee;
	
	User(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUserEnrollmentDate() {
		return userEnrollmentDate;
	}

	public void setUserEnrollmentDate(Date userEnrollmentDate) {
		this.userEnrollmentDate = userEnrollmentDate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Boolean getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(Boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	
	@Override
	public String toString() {
		return "Name:" + name;
	}
}

class Item{
	private String ItemId;
	private String ItemName;
	private int price;
	private int quantity;
	private String ItemType; 

	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItemType() {
		return ItemType;
	}
	public void setItemType(String itemType) {
		ItemType = itemType;
	}
	
}

class Bill{
	double calculateBill() {
		
		return 0;
		
	}
	double calculateDiscount() {
		
		return 0;
		
	}
	void showBill(HashMap<String, Integer> hm) {
		
	}
	
}