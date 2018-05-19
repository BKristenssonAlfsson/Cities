package dataaccess;

import java.util.*;
import javax.ejb.*;

import domain.Cities;

@Local
public interface DataAccessLocal {
  public void addCity(Cities city);
  public void removeCity(String name);
  public List<Cities> showAllCities();
  public String getCityByName(String name);
  public List<Cities> getCitiesBetweenMinMaxPopulation();
public void updateCity(String name, String newName, Integer population);
}
