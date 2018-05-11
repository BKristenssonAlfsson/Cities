package java.transactions;

import javax.ejb.*;
import javax.enterprise.inject.Default;
import javax.persistence.*;
import java.util.*;

import java.domain.City;

@Stateless
@Default
public class TransactionsImplementation implements CityDataAccessInterface {

    @PersistenceContext(unitName="cities")
    private EntityManager em;

    @Override
    public void addCity(City city) {

    }

    @Override
    public void removeCity(City city) {

    }

    @Override
    public List showAllCities() {
      return null;
    }
}
