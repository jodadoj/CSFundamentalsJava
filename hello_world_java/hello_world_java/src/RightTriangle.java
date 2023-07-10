public class RightTriangle {
    public static void main(String[] args) {
        boolean ans = false;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;

        ans = a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2;
        ans = ans && Math.abs(a) == a;
        ans = ans && Math.abs(b) == b;
        ans = ans && Math.abs(c) == c;
        ans = ans && a2 != 0;
        ans = ans && b2 != 0;
        ans = ans && c2 != 0;

        System.out.println(ans);
    }
}
