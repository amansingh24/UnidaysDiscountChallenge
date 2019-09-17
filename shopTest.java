import java.util.*;

public class shopTest { //file to test the functionality of the discount system class
	
	public static void main(String[] args) {
		
		Item product1 = new Item(); //creates a new item object
		product1.setPriceRule(12); //sets the price rules
		product1.setName('B'); //sets the item type
		Item product2 = new Item();
		product2.setPriceRule(12);
		product2.setName('B');
		
		ArrayList <Item> myList = new ArrayList<Item>(); //creates a list to store the items (the basket)
		
		UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(); //creates an instance of the discount class

		example.AddToBasket(product1,myList);
		example.AddToBasket(product2,myList); //adds both products to the basket
		
		System.out.println("These are the following items in the basket: ");
		
		for (int i=0; i< myList.size(); i++) {
			System.out.println("Item " + (i+1) + ", type: " + (myList.get(i)).getName() + ", price: " + (myList.get(i)).getPriceRule() + " GBP");
		}
		
		
		
		
		
		
		
		
		int result = example.CalculateTotalPrice(myList); //calculates the total price 
		System.out.println("Final price, including delivery: " + result + " GBP"); //prints the result
		

		
		
	}
	
}