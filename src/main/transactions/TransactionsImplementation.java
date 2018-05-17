package transactions;

import javax.ejb.*;
import javax.enterprise.inject.Default;
import javax.persistence.*;
import java.util.*;

import domain.City;
import se.yrgo.bjorn.elements.domain.Elements;

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
      //To be implemented
    }

    @Override
    public List<City> showAllCities() {
		Query q = em.createNativeQuery("SELECT * FROM cities;", City.class);
		List<City> cities = q.getResultList();
		return cities;
    }

    @Override
    public String getCityById(int id) {
    	Query q = em.createNativeQuery("SELECT * FROM cities WHERE id = :number;", City.class);
    	q.setParameter("number", number);
    	List<City> result = q.getResultList();
    	return result.toString();
    }

    public List<City> getCitiesBetweenMinMaxPopulation(){
      return null;
    }
}
