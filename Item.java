public class Item { //This is the class which allows for the creation of items in the testing class
	
	//**ATTRIBUTES
	private int price;//stores the price of the item
	private char name; //stores the name of the item
	//**Method
	
	public void setPriceRule (int num) { //Setter method, which sets the price of the item
		this.price = num;
	}
	
	public int getPriceRule() { //Getter method, this gets the price of the item
		return this.price;
	}
	
	public void setName (char name) { //Setter method, this sets the name of the item
		this.name = name;
	}
	
	public char getName () { //Getter method, this gets the name of the item
		return this.name;
	}



}