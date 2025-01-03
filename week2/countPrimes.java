public class countPrimes {

  public static void main(String[] args) {

    // get the number from command line
    int n = Integer.parseInt(args[0]);

    // because we know 2 is the only number that is even and prime
    int count = 1;
    int checkPrime = 2;
    boolean isPrime = true;
    checkPrime++;

    // less than number < 5
    while (checkPrime < n) {
      isPrime = true;
      for (int i = 2; i < (int) Math.sqrt(checkPrime) + 1; i++) {
        if (checkPrime % i == 0) {
          isPrime = false;
        }
      }

      if (isPrime) {
        count += 1;
      }

      checkPrime += 2;
    }

    System.out.printf("Number of Primes upto %d = %d.\n", n, count);
  }
}
