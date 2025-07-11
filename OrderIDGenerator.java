


import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        // Create a Random object to generate random values
        Random random = new Random(); 

        // Declare an array to store 8 OrderIDs
        String[] orderId = new String[8];

        // Loop to generate each OrderID
        for (int index = 0; index < orderId.length; index++) {
            // Generate a random uppercase letter from A (65) to H (72)
            char prefix = (char)(random.nextInt(8)+'A');

            // Generate a random number between 1 and 999
            int number = random.nextInt(999) + 1;

            // Format number to always be 3 digits, padding with zeros if needed
            // For example, 7 becomes "007"
            String suffix = String.format("%03d", number);

            orderId[index] = prefix + suffix;
        }

        for (String item : orderId) {
            System.out.println(item);
        }
    }
}
