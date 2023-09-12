package strategy;

public class DesEnctyption implements Encryption {
  @Override
  public void encrypt(String message) {
    System.out.println("Encrypting " + message + " using DES");
  }
}
