public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            return 0;
        }
        if (b == 0) {
            return a;
        }
        int c = a % b;
//        return c == 0 ? b : gcd(b, c);
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int c = gcd(a, b);
        if (c == 0){
            return 0;
        }
        c = b / c;
        c = c * a;
        return c;
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        if (Math.abs(n) != n) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            count = areRelativelyPrime(i, n) ? count + 1 : count;
        }
        return count;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.printf("gcd(%s, %s) = %s%n", a, b, gcd(a, b));
        System.out.printf("lcm(%s, %s) = %s%n", a, b, lcm(a, b));
        System.out.printf("areRelativelyPrime(%s, %s) = %s%n", a, b, areRelativelyPrime(a, b));
        System.out.printf("totient(%s) = %s%n", a, totient(a));
        System.out.printf("totient(%s) = %s%n", b, totient(b));
    }
}
