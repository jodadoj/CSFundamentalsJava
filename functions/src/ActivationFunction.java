public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x == 0.0) {
            return 0.5;
        }
        return x > 0.0 ? 1.0 : 0.0;

    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        return Math.pow(1.0 + Math.exp(-x), -1.0);
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x > 20){
            return 1;
        }
        if (x < -20){
            return -1;
        }
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (Double.isInfinite(x)) {
            return x > 0 ? 1.0 : -1.0;
        }
        return x / (1.0 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x < 0) {
            return x > -2 ? x + (Math.pow(x, 2.0) / 4) : -1;
        }

        return x < 2 ? x - (Math.pow(x, 2.0) / 4) : 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        System.out.printf("heaviside(%s) = %s%n", x, heaviside(x));
        System.out.printf("sigmoid(%s) = %s%n", x, sigmoid(x));
        System.out.printf("tanh(%s) = %s%n", x, tanh(x));
        System.out.printf("softsign(%s) = %s%n", x, softsign(x));
        System.out.printf("sqnl(%s) = %s%n", x, sqnl(x));

    }

}