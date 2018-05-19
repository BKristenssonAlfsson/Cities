package transactions;

import java.util.*;
import javax.ejb.*;
import domain.Cities;

@Local
public interface CityDataAccessInterface {
  public abstract void addCity(Cities city);
  public abstract void removeCity(String city);
  public abstract List<Cities> showAllCities();
  public abstract String getCityByName(String name);
  public abstract List<Cities> getCitiesBetweenMinMaxPopulation();
  public abstract void updateCity(String name, String newName, Integer population);
}
