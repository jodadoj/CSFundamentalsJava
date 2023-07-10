public class ShannonEntropy {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int[] total = new int[m];
        double x = 0;
        double sum = 0;
        int count = 0;

        while (!StdIn.isEmpty()) {
            int current = StdIn.readInt();
            total[current - 1] += 1;
            count += 1;
        }
        for (int i = 0; i < m; i++) {
//            System.out.println(total[i]);
            double p = (double) total[i] / (double) count;
//            System.out.println(p);
            if (p != 0) {
                x = p * (Math.log(p) / Math.log(2));
            } else {
                x = 0;
            }
//            System.out.println(x);
            sum -= x;
//            System.out.println(sum);
        }

        System.out.printf("%.4f", sum);

    }
}
