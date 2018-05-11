package java.dataaccess;

import javax.annotation.*;
import javax.ejb.*;
import javax.inject.*;
import java.util.*;

import java.domain.City;
import java.transactions.CityDataAccessInterface;

@Stateless
public class CityDataAccess implements DataAccessLocal, DataAccessRemote {

  @Inject
  private CityDataAccess cda;

  public void addCity(City city) {
    cda.addCity(city);
  }
  public void removeCity(City city) {
    cda.removeCity(city);
  }
  public List showAllCities() {
    return cda.showAllCities();
  }
}
