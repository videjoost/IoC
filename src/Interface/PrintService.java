package Interface;

public class PrintService implements Service {
  @Override
  public void execute() {
    System.out.println("PrintService executing");
  }

}
