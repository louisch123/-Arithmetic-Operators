# Instructions  
### Description:
In this activity you will be able to practice using basic arithmetic operators in Java. 

An operator is a special symbol or keyword that performs some task with one of more values, and returns some data. *"Returning"* data means that the value can be assigned to a variable, used as an argument to a method, or used in another operation. Basically, it is our way of giving us developers some new data to work with.

In Java there are three (3) categories for operators: *unary* operators, *binary* operators and *ternary* operators. As their names imply, a *unary* operator applies logic to a single expression. A *binary* operators performs logic using two expressions and a *ternary* operator applies logic using three expressions. The expressions used in an operation are known as the *operands*. 

Note that we will not explore every operator here, but we will cover many of the most basic unary and binary operators.


### Steps:
1. Add in the following code before your class definition in Main.java:
```Java
import java.util.Scanner;
```
Recall that the Scanner class exists within the `util` package of the JRE and must be imported to be used.
  
2. Next, add the following code to the **main()** method of the **Main.java** file:
```Java
// Create a Scanner Object
Scanner input = new Scanner(System.in);

// Console message to user
System.out.println("What numbers would you like to do math with?");

// Use Scanner Object to obtain values for two variables, x and y
int x = input.nextInt();
int y = input.nextInt();

// Close the scanner object
input.close();
```
Here we are creating and leveraging a Scanner object to obtain two `int` values we will use to perform calculations in our code. The comments in the snippet above detail what the lines of this code are responsible for.

3. Now, add the following code to your **main()** method, below your existing code:
```Java
System.out.println(x + y);
```
This code will print the sum of the variables `x` and `y`. The addition operator (`+`) returns the sum total of two numerical operands.

4. Now its your turn! Using the subtraction operator (`-`) in a println statement to print the difference between `x` and `y`.

5. Now, use the multiplication operator (`*`) in a println statement to print the product of `x` and `y`.

6. Next, use the division operator (`/`) in a println statement to print the quotient of `x` and `y`. Now run the program.

Note, if the division of `x` and `y` were to result in a decimal value the decimal is truncated when using `int` variables. For example, `5 / 2` would return `2`, not `2.5` to an int variable.

7. Now, add the following code to your **main()** method, below your existing code:
```Java
System.out.println(x % y);
```
This code uses the *modulus* (`%`) operator, which will divide the first operand by the second, and then return the remainder after the division, disregarding the quotient. The *modulus* (`%`) operator is helpful to determine if a number is a multiple of another, and is used often to find odd or even values. For example, `5 % 2` will return `1`, whereas `4 % 2` will return `0`.

8. Next, we'll review a common Unary operation, *incrementation* and *decrementation*. The *increment* (`++`) and *decrement* (`--`) operators are used to increase or decrease the value of a numerical variable by 1, respectively. The *increment* and *decrement* operators can be applied to a variable before calling the variable (*pre-increment*/*pre-decrement*) or after the variable (*post-increment*/*post-decrement*).

When used after the variable, the *post-increment* (or *post-decrement*) operator will return the current value of the variable then internally increase (or decrease) the variable's value.

Add the following code to your **main()** method, below your existing code and run your program:
```Java
System.out.println("Post-Increment Operator:");
int post = 10;
System.out.println(post++);
System.out.println(post);
```
The last few lines of your output should be as follows:
```
Post-Increment Operator:
10
11
```
The line `System.out.println(post++)` prints 10 to the console, despite using the increment operator. This is because the operator returns the current value of the variable at that time (`10`) then internally increases the value by 1, as we can see with the next line (`11`).

9. Now, add the following code to your **main()** method, below your existing code and run your program:
```Java
System.out.println("Pre-Increment Operator:");
int pre = 10;
System.out.println(++pre);
System.out.println(pre);
```
The output for this code should be:
```
Pre-Increment Operator:
11
11
```
Here, we see that the value of the variable `pre` is increased by 1 then the new, increased value is returned.

### Test:
Use the test provided. This test accounts for the print statements.

#### Sample:
Input:
```
10
2
```
Output:
```
What numbers would you like to do math with?
12
8
20
5
0
Post-Increment Operator:
10
11
Pre-Increment Operator:
11
11
```