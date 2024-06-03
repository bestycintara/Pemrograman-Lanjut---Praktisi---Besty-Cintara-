package Latihan;

public class ThrowKeyword {
    static void checkPrice(int price) {
        if (price < 3000000) {
          throw new ArithmeticException("Access denied - You must be at least have 3 million dollar.");
        }
        else {
          System.out.println("Access granted - You are in!");
        }
      }

      public static void main(String[] args) {
        checkPrice(2000000); // Set price to 2.0 million (which is below 3 million...)
      }
}