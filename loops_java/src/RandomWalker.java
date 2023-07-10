public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println(String.format("(%s, %s)", x, y));
        while (Math.abs(x) + Math.abs(y) != r) {
            double direction = Math.random();
            if (direction < 0.25) {
                y += 1;
            } else if (direction < 0.5) {
                x += 1;
            } else if (direction < 0.75) {
                y -= 1;
            } else {
                x -= 1;
            }
            steps += 1;
            System.out.println(String.format("(%s, %s)", x, y));
        }
        System.out.println(String.format("steps = %s", steps));
    }
}
