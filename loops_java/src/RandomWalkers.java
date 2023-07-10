public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double avg_steps = 0.0;
        for (int i = 0; i < trials; i++) {
            int steps = 0;
            int x = 0;
            int y = 0;
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
            }
            avg_steps += steps;
        }
        avg_steps /= trials;
        System.out.println("average number of steps = " + avg_steps);
    }
}
