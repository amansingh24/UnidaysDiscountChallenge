public class PricingRules { //This class creates the pricing rules which will be used in my program
	
	//** ATTRIBUTES
	private int finalPrice; //stores the final calculated price
	private int deliveryCharge; //stores the deliveryCharge
	private int quotient = 0; //stores the whole number when division occurs, this is to apply the discounts for multibuying
	private int remainder = 0; //this stores the number of items that do not apply to a multibuy discount
	//** Method
	
	public int getPrice (int price, int itemNumber, char itemLetter) { //this method returns the price of a basket
		
		finalPrice = 0;
		
		if (itemLetter == 'A') {
			finalPrice = price * itemNumber;
		} else if (itemLetter == 'B') {
			quotient = itemNumber/2;
			remainder = itemNumber % 2;
			finalPrice = (quotient * 20) + (remainder * price);
		} else if (itemLetter == 'C') {
			quotient = itemNumber/3;
			remainder = itemNumber % 3;
			finalPrice = (quotient * 10) + (remainder * price);
		} else if (itemLetter == 'D') {
			quotient = itemNumber/2;
			remainder = itemNumber % 2;
			finalPrice = (quotient * 7) + (remainder * price);
		} else if (itemLetter == 'E') {
			quotient = itemNumber/3;
			remainder = itemNumber % 3;
			finalPrice = (quotient * 10) + (remainder * price);
		} else {
			System.out.print("");
		}
		
		//Pricing Rules for each item depending on the item type.
		
		return finalPrice;
		
	}
	
	public int deliveryCharge (int total) { //method which returns the deliveryCharge
		if (total >= 50) {
			deliveryCharge = 0;
		} else {
			deliveryCharge = 7;
		}
		
		return deliveryCharge;
	}


	
}