package Service;

import Interface.Service;
import java.util.ArrayList;
import java.util.List;

public class IoCContainer {

  private final List<Service> services = new ArrayList<>();

  public void register(Service serviceInstance) {
    services.add(serviceInstance);
  }

  public List<Service> getServices() {
    return services;
  }

}
