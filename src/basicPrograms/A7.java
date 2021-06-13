package basicPrograms;
// Java program to find GCD of two
// numbers using Euclidean algorithm
class A7 {
    // Function to return gcd of x and y
    // recursively
    static int GCD(int x, int y) {
        if (y == 0)
            return x;
        return GCD(y, x % y);
    }

    // The Driver code
    public static void main(String[] args) {
        int x = 47, y = 91;
        System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y));
    }
}
