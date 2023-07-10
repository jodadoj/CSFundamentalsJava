public class WorldMap {
    public static void main(String[] args) {

        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty() && StdIn.hasNextLine()) {

            String currentName = StdIn.readString();
            int currentLength = StdIn.readInt();

            double[] xi = new double[currentLength];
            double[] yi = new double[currentLength];

            for (int i = 0; i < currentLength; i++) {

                xi[i] = StdIn.readDouble();
                yi[i] = StdIn.readDouble();

            }

            StdDraw.polygon(xi, yi);

        }
    }
}
