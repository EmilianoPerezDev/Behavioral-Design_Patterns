package state;

public class BicicyclingMode implements TravelMode {
  @Override
  public void getETA() {
    System.out.println("Calculating ETA (bicycling)");
  }

  @Override
  public void getDirections() {
    System.out.println("Calculating Direction (bicycling)");
  }
}
