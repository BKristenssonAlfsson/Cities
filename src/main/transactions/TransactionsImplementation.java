package transactions;

import javax.ejb.*;
import javax.enterprise.inject.Default;
import javax.persistence.*;
import java.util.*;

import domain.City;

@Stateless
@Default
public class TransactionsImplementation implements CityDataAccessInterface {

    @PersistenceContext(unitName="cities")
    private EntityManager em;

    @Override
    public void addCity(City city) {
      em.persist(city);
    }

    @Override
    public void removeCity(City city) {
      
    }

    @Override
    public List showAllCities() {
      return null;
    }

    @Override
    public String getCityById(int id) {
      return null;
    }

    public List getCitiesBetweenMinMaxPopulation(){
      return null;
    }
}
