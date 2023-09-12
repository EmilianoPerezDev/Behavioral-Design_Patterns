package strategy;

public class ChatClient {
  private String encryptionAlgorithm;

  public void send(String message, Encryption encryption) {
    encryption.encrypt(message);
  }
}
