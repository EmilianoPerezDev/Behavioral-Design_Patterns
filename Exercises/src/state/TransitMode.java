package state;

public class TransitMode implements TravelMode {
  @Override
  public void getETA() {
    System.out.println("Calculating ETA (transit)");
  }

  @Override
  public void getDirections() {
    System.out.println("Calculating Direction (transit)");
  }
}
