package state;

public class DrivingMode implements TravelMode {
  @Override
  public void getETA() {
    System.out.println("Calculating ETA (driving)");
  }

  @Override
  public void getDirections() {
    System.out.println("Calculating Direction (driving)");
  }
}
