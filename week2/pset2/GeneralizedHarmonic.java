package pset2;

public class GeneralizedHarmonic {
  public static void main(String[] args) {

    // check for commandline args
    if (args.length != 2) {
      System.out.println("Usage: java GeneralizedHarmonic <n> <r>");
      return;
    }

    int n = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);
    double sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += (1 / Math.pow(i, r));
    }

    System.out.println(sum);
  }
}
