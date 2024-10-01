package Service;

import Interface.Service;

public class Client {

  private Service service;

  public Client(Service service) {
    this.service = service;
  }

  public void performAction() {
    service.execute();

  }

}
