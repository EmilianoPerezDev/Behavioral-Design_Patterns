package chainOfResponsibility;

public class Encrypter extends Handler {
  public Encrypter(Handler next) {
    super(next);
  }

  @Override
  public boolean doHandle(HttpRequest request) {
    System.out.println("Encryption");

    return false;
  }
}
