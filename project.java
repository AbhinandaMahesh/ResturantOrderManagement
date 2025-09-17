package restaurantordermanagement;
import java.util.*;

public class project {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double bill = 0;
	int choice;
	
	System.out.println("welcome to foodie restaurant");
	long orderID = (long)(Math.random() * 10000);
	System.out.println("your order id: "+orderID);
	
	do {
		System.out.println("\n====== Menu =======");
		System.out.println("1. pizza = R300");
		System.out.println("2. Burger = R250");
		System.out.println("3. Coffee = R100");
		System.out.println("exit & generation bill");
		System.out.println("enter your item: ");
		choice = sc.nextInt();
		
		int qty;
		switch(choice) {
		case 1:
			System.out.println("enter quantity: ");
			qty = sc.nextInt();
			bill += 300 * qty;
			break;
		
		case 2:
			System.out.println("enter quantity");
			qty = sc.nextInt();
			bill += 250 * qty;
			break;
		case 3:
			System.out.println("enter quantity: ");
			qty = sc.nextInt();
			bill += 100 * qty;
			break;
		case 4:
			System.out.println("exiting.....");
			break;
			default:
				System.out.println("invalid choice");
				continue;
		}
	}while(choice != 4);
	
	if(bill > 500) {
		System.out.println("congratulation you get free delivery");
	}else {
		bill += 50;
		System.out.println("50 added as a delivery charge");
		
	}
	System.out.println("final bill: "+bill);
	System.out.println("Thank Your order will arrive soon...");
	sc.close();
}
}
