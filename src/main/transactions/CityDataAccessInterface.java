package transactions;

import java.util.*;
import javax.ejb.*;
import domain.City;

@Local
public interface CityDataAccessInterface {
  public abstract void addCity(City city);
  public abstract void removeCity(City city);
  public abstract List showAllCities();
  public abstract String getCityById(int id);
  public abstract List getCitiesBetweenMinMaxPopulation();
}
