public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int fullLength = m * n;
        String[] minefield = new String[fullLength];
        int[] mines = new int[k];
        char mineChar = '*';
        char freeSpace = 'X';
        for (int i = 0; i < k; i++) {
            int select = 0;
            do {
                select = (int) Math.round(Math.random() * (fullLength - 1));
            } while (minefield[select] != null && minefield[select].equals(String.valueOf(mineChar)));
            minefield[select] = String.valueOf(mineChar);
            mines[i] = select;
        }
        for (int i = 0; i < minefield.length; i++) {
            if (minefield[i] == null){
                minefield[i] = "X";
            }
        }

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(minefield[j + n * i] + "  ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int current = (i * n) + j;

                int up = current - n;
                int down = current + n;
                int left = current - 1;
                int right = current + 1;

                boolean upExists = up > -1;
                boolean downExists = down < m * n;
                boolean leftExists = left > (i) * n - 1;
                boolean rightExists = right < (i + 1) * n;

                int sum = 0;

                if (upExists) {
                    if (minefield[up].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                    if (leftExists && minefield[up - 1].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                    if (rightExists && minefield[up + 1].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                }
                if (downExists) {
                    if (minefield[down].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                    if (leftExists && minefield[down - 1].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                    if (rightExists && minefield[down + 1].equals(String.valueOf(mineChar))) {
                        sum += 1;
                    }
                }
                if (leftExists && minefield[left].equals(String.valueOf(mineChar))) {
                    sum += 1;
                }
                if (rightExists && minefield[right].equals(String.valueOf(mineChar))) {
                    sum += 1;
                }

                if (!minefield[current].equals(String.valueOf(freeSpace))) {
                    System.out.print("*  ");
                } else {
                    System.out.print(sum + "  ");
                }
            }

            System.out.println();
        }
    }
}
