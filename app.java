public class ControlFlowExample {
    public static void main(String[] args) {
        int number = 7;
        
        // 1. Conditional (If-Else) statement to check parity
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        System.out.println("\nMultiplication table for " + number + ":");
        
        // 2. For loop execution
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
