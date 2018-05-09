package java.dataaccess;

import java.util.List;
import java.domain.City;

public interface DataAccessRemote {
  public void addCity(City city);
  public void removeCity(City city);
  public List showAllCities();
}
