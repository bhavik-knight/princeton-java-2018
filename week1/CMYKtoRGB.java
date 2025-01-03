public final class CMYKtoRGB {
  private CMYKtoRGB() {
    throw new UnsupportedOperationException();
  }

  public static void main(final String[] args) {

    final double cyan = Double.parseDouble(args[0]);
    final double magenta = Double.parseDouble(args[1]);
    final double yellow = Double.parseDouble(args[2]);
    final double black = Double.parseDouble(args[3]);

    final double white = 1 - black;
    final double red = 255 * white * (1 - cyan);
    final double green = 255 * white * (1 - magenta);
    final double blue = 255 * white * (1 - yellow);

    System.out.printf(
        "red = %d\ngreen = %d\nblue = %d\n", Math.round(red), Math.round(green), Math.round(blue));
  }
}
