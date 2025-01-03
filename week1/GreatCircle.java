public class GreatCircle {
  public static void main(String[] args) {

    // get four command line args as coordinates of point p1 and p2
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);

    // convert all into radians
    double lat1 = Math.toRadians(x1);
    double lat2 = Math.toRadians(x2);
    double long1 = Math.toRadians(y1);
    double long2 = Math.toRadians(y2);
    final double earthRadius = 6371.0;

    double havLat = Math.pow(Math.sin((lat2 - lat1) / 2), 2);
    double havLong = Math.pow(Math.sin((long2 - long1) / 2), 2);
    double havFormula = havLat + Math.cos(lat1) * Math.cos(lat2) * havLong;

    // the distance required
    double result = 2 * earthRadius * Math.asin(Math.sqrt(havFormula));

    System.out.println(result + " kilometers");
    // System.out.println(distance + " kilometers");
  }
}
