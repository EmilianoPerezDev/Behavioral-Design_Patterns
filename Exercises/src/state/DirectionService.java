package state;

public class DirectionService {
  private TravelMode currentMode;

  public void getEta() {
    currentMode.getETA();
  }

  public void getDirection() {
    currentMode.getDirections();
  }


  public TravelMode getCurrentMode() {
    return currentMode;
  }

  public void setCurrentMode(TravelMode currentMode) {
    this.currentMode = currentMode;
  }
}