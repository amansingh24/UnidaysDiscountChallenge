import java.util.*; //Used to import the arraylist functions available in java

public class UnidaysDiscountChallenge {
	
	//private ArrayList<Item> myList;
	
	
	
	public void AddToBasket(Item product, ArrayList <Item> myList) { //this takes the item and list as params and then adds the item to the basket.
		
		
		myList.add(product);
		
		
		
	}
	
	public int CalculateTotalPrice (ArrayList <Item> myList) { //this calculates the total price of the items in the basket
		
		int Total = 0;
		
		ArrayList<Character> productList = new ArrayList<Character>(); //This stores all the products that are in stock
		ArrayList<Integer> productCount = new ArrayList <Integer>(); //this stores the number of each type of item in the list
		productList.add('A');
		productList.add('B');
		productList.add('C');
		productList.add('D');
		productList.add('E');
		
		for (int k=0; k <productList.size(); k++) { //This loops through the product list one by one
			char tempLetter = productList.get(k); //This stores the current letter that the loop is on
		
		
			int i = 0;
			int tempCount = 0; //this counter counts the number of products of a specific type
			while (i < myList.size()) { //loops through the user basket
				
				
				Item temp = myList.get(i); //stores the first item object in the list
				char temp2 = temp.getName(); //gets the letter type of the item
				
				if (temp2 == tempLetter) { //adds one to the counter
					tempCount = tempCount + 1;
				}
				
				i++;
				
			}
			
			productCount.add(tempCount); //once the couting of a specific type of product has been done it is added the count list which stores the number of a specific type of item
			
		}		
			
		int z = 0;
		
		while (z < myList.size()) { //loops through the basket again
			Item temp3 = myList.get(z); //stores the item
			int tempProductCount = productCount.get(z); //gets the count of the first item type
			PricingRules obj1 = new PricingRules (); //insantiates the pricing rules
			char letter = temp3.getName(); //gets the name of the item type
			int tempPrice = temp3.getPriceRule(); //gets the price of the item type
			Total = Total + obj1.getPrice(tempPrice,tempProductCount,letter); //calculates the total using the pricing rules class
			
			z++;
			
		}
		
		PricingRules obj1 = new PricingRules (); //creates the pricing rules again outside the while loop.
		System.out.println("This delivery charge for this order is: " + obj1.deliveryCharge(Total) + " GBP" );
		int finalPrice = Total + obj1.deliveryCharge(Total); //adds on the deliveryCharge.
		
		
		return finalPrice; //returns finalPrice
		
	}
	
	public static void main(String[] args) {
		// int finalPrice = 0;
		// PricingRules obj1 = new PricingRules ();
		// finalPrice = obj1.getPrice(8,2,'A');
		// System.out.println(finalPrice);
		// Item obj2 = new Item();
		// obj2.setPrice(8);
		// int test = obj2.getPrice();
		// System.out.println(test);
		
		//List<Item> myList = new ArrayList<Item>();
		
		// Item product1 = new Item();
		// product1.setPriceRule(12);
		// product1.setName('B');
		// Item product2 = new Item();
		// product2.setPriceRule(12);
		// product2.setName('B');
		
		
		
		
	}

}