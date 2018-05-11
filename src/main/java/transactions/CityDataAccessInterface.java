package java.transactions;

import java.util.*;
import javax.ejb.*;
import java.domain.City;

@Local
public interface CityDataAccessInterface {
  public abstract void addCity(City city);
  public abstract void removeCity(City city);
  public abstract List showAllCities();
}
