public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char[] seq = new char[n];
        seq[0] = '1';
        int end = 1;
        while (seq[n - 1] != '1' && seq[n - 1] != '0') {
            int count = end;
            for (int j = 0; j < count; j++) {
                char current = seq[j];
                int pos = j + count;
                if (current == '1' && pos < n) {
                    seq[pos] = '0';
                } else if (current == '0' && pos < n) {
                    seq[pos] = '1';
                } else {
                    count = j;
                    break;
                }
            }
            end += count;
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (seq[j] == seq[i]){
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}

