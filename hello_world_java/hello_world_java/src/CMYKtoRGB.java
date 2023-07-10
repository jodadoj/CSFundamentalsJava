public class CMYKtoRGB {
    public static void main(String[] args) {

        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1.0 - black;
        double red = 255.0 * white * (1.0 - cyan);
        double green = 255.0 * white * (1.0 - magenta);
        double blue = 255.0 * white * (1.0 - yellow);

        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));
    }
}
