import java.util.Scanner;

/**
 * Calculates the cost of a pizza
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // find out how big the pizza is
    System.out.println("What is the size of the pizza (in cm):");
    int pizzaSize = input.nextInt();

    // Constant for money per pizza
    final double PIZZA_COST = 0.75;

    // Constant for cost of running ovens
    final double OVEN_COST = 0.99;

    // Constant for cost of toppings
    final double TOPPINGS_COST = 0.50;

    // Constant for small pizza
    final int SMALL_PIZZA = 20;

    // Constant for medium pizza low
    final double MEDIUM_LOW = 20.01;

    // Constant for medium pizza high
    final int MEDIUM_HIGH = 40;

    // Constant for large pizza
    final double LARGE_PIZZA = 40.01;

    // find out what size of pizza they have and cost
    if (pizzaSize <= SMALL_PIZZA){
      double subtotal = pizzaSize * TOPPINGS_COST + OVEN_COST + PIZZA_COST;
      double taxes = subtotal * 0.13;
      double total = subtotal + taxes;
      System.out.println("Subtotal: " + "$" + subtotal);
      System.out.println("Taxes: " + "$" + taxes);
      System.out.println("Total: " + "$" + total);
      System.out.println("We are going to make you a cute little pizza!");
    } else if (pizzaSize >= MEDIUM_LOW && pizzaSize <= MEDIUM_HIGH) {
      double subtotal = pizzaSize * TOPPINGS_COST + OVEN_COST + PIZZA_COST;
      double taxes = subtotal * 0.13;
      double total = subtotal + taxes;
      System.out.println("Subtotal: " + "$" + subtotal);
      System.out.println("Taxes: " + "$" + taxes);
      System.out.println("Total: " + "$" + total);
      System.out.println("This will be delicious!");
    } else {
      double subtotal = pizzaSize * TOPPINGS_COST + OVEN_COST + PIZZA_COST;
      double taxes = subtotal * 0.13;
      double total = subtotal + taxes;
      System.out.println("Subtotal: " + "$" + subtotal);
      System.out.println("Taxes: " + "$" + taxes);
      System.out.println("Total: " + "$" + total);
      System.out.println("Whoa, big pizza! You might need a truck to bring this home");
    }







  }
}
