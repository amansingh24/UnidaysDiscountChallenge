import java.util.*;

public class shopTest { //file to test the functionality of the discount system class
	
	public static void main(String[] args) {
		
		Item product1 = new Item(); //creates a new item object
		product1.setPriceRule(12); //sets the price rules
		product1.setName('B'); //sets the item type
		Item product2 = new Item();
		product2.setPriceRule(12);
		product2.setName('B');
		Item product3 = new Item();
		product3.setPriceRule(12);
		product3.setName('B');
		Item product4 = new Item();
		product4.setPriceRule(12);
		product4.setName('B');
		Item product5 = new Item();
		product5.setPriceRule(4);
		product5.setName('C');
		Item product6 = new Item();
		product6.setPriceRule(4);
		product6.setName('C');
		Item product7 = new Item();
		product7.setPriceRule(4);
		product7.setName('C');
		
		ArrayList <Item> myList = new ArrayList<Item>(); //creates a list to store the items (the basket)
		
		UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(); //creates an instance of the discount class

		example.AddToBasket(product1,myList);
		example.AddToBasket(product2,myList); //adds both products to the basket
		example.AddToBasket(product3,myList);
		example.AddToBasket(product4,myList);
		example.AddToBasket(product5,myList);
		example.AddToBasket(product6,myList);
		example.AddToBasket(product7,myList);
		
		
		System.out.println("These are the following items in the basket: ");
		
		for (int i=0; i< myList.size(); i++) {
			System.out.println("Item " + (i+1) + ", type: " + (myList.get(i)).getName() + ", price: " + (myList.get(i)).getPriceRule() + " GBP");
		}
		
		
		
		
		
		
		
		
		int result = example.CalculateTotalPrice(myList); //calculates the total price 
		System.out.println("Final price, including delivery: " + result + " GBP"); //prints the result
		

		
		
	}
	
}