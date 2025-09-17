# Restaurant Order Management System

A simple Java-based console application for managing restaurant orders, calculating bills, and applying delivery charges based on order value.

## Features

- **Menu Display**: Shows available food items with their prices
- **Order Processing**: Allows users to select items and specify quantities
- **Automatic Order ID Generation**: Creates a unique order ID for each transaction
- **Bill Calculation**: Automatically calculates the total bill including:
  - Item costs based on quantity
  - Free delivery for orders over R500
  - R50 delivery charge for orders under R500
- **User-Friendly Interface**: Simple console-based menu system

## Menu Items and Prices

1. Pizza - R300
2. Burger - R250
3. Coffee - R100

## How to Use

1. Run the program
2. You'll be assigned a unique order ID
3. Select items from the menu by entering the corresponding number (1-3)
4. Enter the quantity when prompted
5. Choose option 4 when you're done ordering to generate your bill
6. The system will calculate your total, applying delivery charges if applicable
7. Your order confirmation will be displayed

## Delivery Policy

- Orders over R500: Free delivery
- Orders under R500: R50 delivery charge added

## Code Structure

The program consists of a single Java class `project` with a main method that:
- Uses a Scanner for user input
- Implements a do-while loop for continuous ordering
- Uses a switch statement to handle menu selections
- Calculates the bill based on user selections
- Applies delivery charges according to the policy

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java IDE or command line tool to compile and run Java programs

## How to Run

1. Compile the Java file:
   ```
   javac project.java
   ```

2. Run the compiled class:
   ```
   java project
   ```

## Example Usage

```
welcome to foodie restaurant
your order id: 4829

====== Menu =======
1. pizza = R300
2. Burger = R250
3. Coffee = R100
exit & generation bill
enter your item: 
1
enter quantity: 
2

====== Menu =======
1. pizza = R300
2. Burger = R250
3. Coffee = R100
exit & generation bill
enter your item: 
4
exiting.....
congratulation you get free delivery
final bill: 600.0
Thank Your order will arrive soon...
```

## Note

This is a simple console application designed for educational purposes. It demonstrates basic Java programming concepts including user input, conditional statements, loops, and arithmetic operations.
