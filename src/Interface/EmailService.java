package Interface;

public class EmailService implements Service {
  @Override
  public void execute() {
    System.out.println("Email Service Executed");
  }
}