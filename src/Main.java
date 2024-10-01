// Main.java
import Interface.EmailService;
import Interface.PrintService;
import Interface.PushNotificationService;
import Interface.SmsService;
import Interface.Service;
import Service.IoCContainer;

public class Main {

  public static void main(String[] args) {

    IoCContainer container = new IoCContainer();

    // Register services
    container.register(new EmailService());
    container.register(new PrintService());
    container.register(new SmsService());
    container.register(new PushNotificationService());

    // Iterate over and execute services

    for (Service service : container.getServices()) {
      service.execute();
    }

    System.out.println("Hello world!");
  }
}