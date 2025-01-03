public class RandomWalkers {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java RandonWalker <r> <trials>");
      return;
    }

    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int sumSteps = 0;

    for (int t = 0; t < trials; t++) {
      // initial state
      int x = 0, y = 0, steps = 0;

      while (Math.abs(x) + Math.abs(y) != r) {

        // generate a random number in [0, 1)
        double random = Math.random();

        // NEWS - direction
        if (random < 0.25) y++;
        else if (random < 0.5) x++;
        else if (random < 0.75) x--;
        else y--;

        steps++;
      }

      sumSteps += steps;
    }

    System.out.println("average number of steps = " + sumSteps / (double) trials);
  }
}
