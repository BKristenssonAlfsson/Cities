package dataaccess;

import javax.annotation.*;
import javax.ejb.*;
import javax.inject.*;
import java.util.*;

import domain.City;
import transactions.CityDataAccessInterface;

@Stateless
public class CityDataAccess implements DataAccessLocal, DataAccessRemote {

  @Inject
  private CityDataAccessInterface cda;

  public void addCity(City city) {
    cda.addCity(city);
  }
  public void removeCity(City city) {
    cda.removeCity(city);
  }
  public List<City> showAllCities() {
    return cda.showAllCities();
  }

  public String getCityById(int id) {
    return cda.getCityById(id);
  }

  public List<City> getCitiesBetweenMinMaxPopulation() {
    return null;
  }

}
