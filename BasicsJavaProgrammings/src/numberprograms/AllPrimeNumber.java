package numberprograms;

public class AllPrimeNumber {
	public static void main(String[] args) {
        int num = 2; // Start checking from number 2 onwards

        while (num <= 100) { // Adjust the range as needed
            boolean isPrime = true;
            
            // Check if num is a prime number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If prime, print the number
            if (isPrime) {
                System.out.println(num);
            }
            
            num++; // Check the next number
        }
    }
}
