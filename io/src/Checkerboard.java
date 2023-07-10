public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean flip = true;
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0, n);
        for (int i = 0; i < n; i++) {
            flip = !flip;
            for (int j = 0; j < n; j++) {
                if (flip) {
                    flip = !flip;
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                } else {
                    flip = !flip;
                    StdDraw.setPenColor(StdDraw.BLUE);
                }
                StdDraw.filledSquare(j + 0.5, i + 0.5, 0.5);
            }
        }
        StdDraw.show();
    }
}
