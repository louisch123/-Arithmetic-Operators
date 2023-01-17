import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What numbers would you like to do math with?");
    int x = input.nextInt();
    int y = input.nextInt();
    input.close();

    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);// Divide and round to the nearest whole number
    System.out.println(x%y);//Modulous- helpful to determine if a number is a multiple of another, and is used often to find odd or even values.
    System.out.println("Post-Increment Operator:");
    int post = 10;
    System.out.println(post++);// add 1- Postfix- //10
    System.out.println(post);//11
    System.out.println("Pre-Increment Operator:");
    int pre = 10;
    System.out.println(++pre);// Taking the current value 11
    System.out.println(pre); // confirming the current value 11
    
  }
}