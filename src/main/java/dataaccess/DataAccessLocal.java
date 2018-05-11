package java.dataaccess;

import java.util.*;
import javax.ejb.*;

import java.domain.City;

@Local
public interface DataAccessLocal {
  public void addCity(City city);
  public void removeCity(City city);
  public List showAllCities();
}
