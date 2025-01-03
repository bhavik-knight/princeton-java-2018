package pset2;

public class RandomWalker {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java RandonWalker <r>");
      return;
    }

    int r = Integer.parseInt(args[0]);

    // initial state
    int x = 0, y = 0, steps = 0;
    System.out.printf("(%d, %d)\n", x, y);

    while (Math.abs(x) + Math.abs(y) != r) {

      // generate a random number in [0, 1)
      double random = Math.random();

      // NEWS - direction
      if (random < 0.25) y++;
      else if (random < 0.5) x++;
      else if (random < 0.75) x--;
      else y--;

      steps++;
      System.out.printf("(%d, %d)\n", x, y);
    }

    System.out.println("steps = " + steps);
  }
}
