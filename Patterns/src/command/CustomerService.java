package command;

import command.fx.Command;

public class CustomerService {
  public void addCustomer() {
    System.out.println("Add customer");
  }

  public static class ResizeCommand implements Command {
    @Override
    public void execute() {
      System.out.println("Resize");
    }
  }
}
