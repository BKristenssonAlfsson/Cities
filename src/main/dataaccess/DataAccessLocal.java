package dataaccess;

import java.util.*;
import javax.ejb.*;

import domain.City;

@Local
public interface DataAccessLocal {
  public void addCity(City city);
  public void removeCity(City city);
  public List<City> showAllCities();
  public String getCityById(int id);
  public List<City> getCitiesBetweenMinMaxPopulation();
}
