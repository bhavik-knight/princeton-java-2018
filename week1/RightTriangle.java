public class RightTriangle {

  public static void main(String[] args) {

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println(false);
      return;
    }

    int small = Math.min(Math.min(a, b), Math.min(b, c));
    int big = Math.max(Math.max(a, b), Math.max(b, c));
    int mid = Math.min(Math.max(a, b), Math.max(Math.min(a, b), c));

    System.out.println(small * small + mid * mid == big * big);
  }
}
