package Interface;

public class SmsService implements Service {
  @Override
  public void execute() {
    System.out.println("SMS Service Executed");
  }
}