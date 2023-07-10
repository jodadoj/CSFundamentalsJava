public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int max = Math.max(trials, 50);

        int[] total = new int[max];
        int highest = 0;

        for (int i = 0; i < trials; i++) {
            boolean[] people = new boolean[n];
            int birthday = (int) Math.round((Math.random() * (n - 1)));
            int current = 0;
            do {
                current += 1;
                people[birthday] = !people[birthday];
                if (people[birthday]) {
                    birthday = (int) Math.round((Math.random() * (n - 1)));
                }
            } while (!people[birthday]);
            highest = Math.max(highest, current);
            total[current] += 1;
        }
        double[][] result = new double[highest][3];
        double current = 0.0;
        for (int i = 0; i < highest; i++) {
            result[i][0] = i + 1;
            result[i][1] = total[i];
            result[i][2] = total[i] / (double) trials + current;
            current += total[i] / (double) trials;
            if (result[i][2] >= 0.5) {
                highest = i + 1;
                break;
            }

        }
        for (int i = 0; i < highest; i++) {
            System.out.println((int) result[i][0] + " " + (int) result[i][1] + " " + result[i][2]);
        }
    }
}
