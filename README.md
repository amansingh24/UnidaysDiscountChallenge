# UnidaysDiscountChallenge #


## Java Install Instructions ##

To compile and run the code, you must have the Java JDK installed on the machine that you desire to run the code on. Below is the link to download the JDK. 

https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Next, in order to compile and execute java code on your system, you must set the path variable in your system settings. You must navigate to where the JDK folder has been installed on your machine and find the bin directory, once this is done copy the file path. 

This should then be set using the instructions from the java website (different for each platform) to finish setting up java to be able to run my code. The instructions on how to set the path are detailed below.

https://www.java.com/en/download/help/path.xml

## Compile Instructions ##

Now, to run the code it must be compiled using the java compiler using CMD. First, navigate to the folder where my code has been downloaded and extract this. Then using your platforms command window, change the directory to the folder where my code has been downloaded.

On Windows, this is done by typing ‘cd’ followed by the full file path. Once this is done, the code can now my compiled with the following commands. 

javac item.java
javac PricingRules.java
javac shopTest.java
javac UnidaysDiscountChallenge.java

Here is an example on how this should look done correctly on a windows command window:

![Alt text](https://github.com/amansingh24/UnidaysDiscountChallenge/blob/master/screenshot1.png?raw=true)

## Running Instructions ##

Next, to run the code, you must type ‘java shopTest’, here is an example of this done correctly:

![Alt text](https://github.com/amansingh24/UnidaysDiscountChallenge/blob/master/screenshot2.png?raw=true)

This will run the file which includes test items which I have created within the file to test my pricing rules working correctly.

## Program Testing ##

![Alt text](https://github.com/amansingh24/UnidaysDiscountChallenge/blob/master/screenshot3.png?raw=true)

In order to test the program, new items must be created using the code here. For each new product, the variable name of ‘product1’ must be changed, for example, ‘product 2’ or ‘product 3’ etc. 

## Problem Breakdown ##

Looking at the initial description of the challenge, I broke down the problem into 4 more manageable parts. These 4 parts were:

•	Item class 

•	Pricing rules class

•	UnidaysDiscountChallenge class (UDC)

•	Testing class

### Problem Breakdown – Item class ###

This class is needed to create the item object, so that it can be used in the testing, pricing rules and the UDC class. In this class, I have decided that it needs getter and setter methods. The setter getter is needed because each item added to the basket needs to be identified by the pricing rules class so that the correct rules can be applied to it. 

Furthermore, the setter method is needed because it means that each new item object that is created can be assigned a type and price. This can then be passed into the pricing rules class and the calculate total price method.

The price set should be stored in a private int as the prices are whole numbers and so that the price cannot be changed by any method outside the class. The type should be stored as a char as the types of items are letters. 

### Problem Breakdown – Pricing Rules Class ###

This class is needed in the program because it defines how the multibuy discounts for each item are applied. 

After looking at the description, I have decided that the class requires the ability to take an item type, price and amount and apply the pricing rules correctly and return a total price. It should then apply delivery charge rules, checking the total price and seeing if the items apply for free delivery.

### Problem Breakdown – UDC class ###

The challenge details that this class should include two methods: addtobasket and calculatetotalprice.

The add to basket function, should take a list and an item and it should contain the code to add the item to this list before returning the list with the item added. It should be an arraylist since the size of the basket should not be limited. The list would need to be of the ‘item’ object type, since it is the items which are getting added to the basket. 

The calculatetotalprice class should initialise the pricing rules class as these will needed to calculate a total. It should take the basket, loop through each item type (since the example only has 5 types, I recognise that this would be inefficient for a large store) and calculate the total number of items of each item. For the item counting, I could use a ‘tempCount’ variable of type ‘int’ which should count the number of items of each type in the basket. 

This should then be passed to the pricing rules, along with the type and price and this should be added to a running total. This total after discount should be stored in a variable called ‘total’ and the delivery charge should be stored in a variable called ‘deliveryCharge’.

The final price will be stored in a variable called ‘finalPrice’. All of these variables will need to be of type ‘int’ since all items in the example have prices which are whole numbers. These would need to be changed to a ‘float’ type if this was not the case.

### Problem Breakdown – Testing Class ###

This class should use the item class to create objects, set prices and types. Furthermore, it should be used to test the UDC class in terms of adding items to the basket and getting the correct total price. 

## Testing Result ##

Here is an example of a test run of the program. 

![Alt text](https://github.com/amansingh24/UnidaysDiscountChallenge/blob/master/screenshot4.png?raw=true)

