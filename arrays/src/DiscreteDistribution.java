//public class DiscreteDistribution {
//    public static void main(String[] args) {
//        int S_i = 0;
//        int m = Integer.parseInt(args[0]);
//
//        for (int i = 1; i < args.length - 1; i++) {
//            int a_i = Integer.parseInt(args[i]);
//            S_i += a_i;
//        }
////        System.out.println(S_i + " ");
//
//        for (int j = m; j > 0; j--) {
//            int r = (int) Math.round(Math.random() * (S_i - 1));
////            System.out.println(r + " ");
//            int n = args.length - 1;
//            while (r > 0) {
//                int a_n = Integer.parseInt(args[n]);
//                r -= a_n;
//                n -= 1;
//            }
//            System.out.print(n + " ");
//        }
//
//    }
//
//}

public class DiscreteDistribution {
    public static void main(String[] args) {
        int[] S_i = new int[args.length-1];
        int m = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i < args.length; i++) {
            int a_i = Integer.parseInt(args[i]);
            S_i[i-1] = a_i;
            sum += a_i;
        }

        for (int j = 0; j < m; j++) {
            int r = (int) Math.round(Math.random() * (sum - 1));
            int result = sum;
            for (int k = S_i.length-1; k >= 0; k--){
                if (result-S_i[k]-r>0){
                    result -= S_i[k];
                } else {
                    k += 1;
                    System.out.print(k + " ");
//                    System.out.print(j + " ");
                    break;
                }
            }
        }

    }

}


//public class DiscreteDistribution {
//    public static void main(String[] args) {
//        int[] S_i = new int[args.length - 1];
//        int m = Integer.parseInt(args[0]);
//        int sum = 0;
//        int[] output = new int[S_i.length];
//
//        for (int i = 1; i < args.length; i++) {
//            int a_i = Integer.parseInt(args[i]);
//            S_i[i - 1] = a_i;
//            sum += a_i;
//        }
//
//        for (int j = 0; j < m; j++) {
//            int r = (int) Math.round(Math.random() * (sum));
//            int result = sum;
//            for (int k = S_i.length - 1; k >= 0; k--) {
//                if (result - S_i[k] - r > 0) {
//                    result -= S_i[k];
//                } else {
//                    output[k] += 1;
//                    System.out.print((k + 1) + " ");
////                    System.out.print(j + " ");
//                    break;
//                }
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
//        }
//    }
//
//}
