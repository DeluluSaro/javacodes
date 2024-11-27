public class ChineseRemainderTheorem {

    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the modular inverse of a with respect to m
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1; // If no inverse exists
    }

    // Function to find the solution to the system of congruences using the Chinese Remainder Theorem
    public static int chineseRemainder(int[] a, int[] m) {
        int prod = 1;
        for (int i = 0; i < m.length; i++) {
            prod *= m[i]; // Product of all moduli
        }

        int result = 0;
        for (int i = 0; i < m.length; i++) {
            int partialProd = prod / m[i];  // Product of all moduli except m[i]
            int inverse = modInverse(partialProd, m[i]); // Modular inverse of partial product modulo m[i]
            if (inverse == -1) {
                System.out.println("No solution exists!");
                return -1;
            }
            result += a[i] * partialProd * inverse; // Add the contribution of the current equation
        }

        return result % prod; // Final result modulo the product of all moduli
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1}; // The remainders
        int[] m = {3, 5, 7}; // The moduli

        int result = chineseRemainder(a, m);
        System.out.println("The solution is x = " + result);
    }
}
