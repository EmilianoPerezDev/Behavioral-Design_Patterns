package strategy;

public class Main {
  public static void main(String[] args) {
    var chatClient = new ChatClient();
    chatClient.send("hola", new DesEnctyption());
  }

}
