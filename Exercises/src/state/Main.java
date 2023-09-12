package state;

public class Main {
  public static void main(String[] args) {
    var directionService = new DirectionService();
    directionService.setCurrentMode(new DrivingMode());
    directionService.getEta();
    directionService.getDirection();
  }
}
