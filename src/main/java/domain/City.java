package java.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="cities")
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private int id;
  @Column(name="name")
  private String name;
  @Column(name="population")
  private int population;

  public City() {}

  public City(String name, int population) {
    this.name = name;
    this.population = population;
  }

  public String getCityName() {
    return name;
  }

  public int getPopulation() {
    return population;
  }

  public String toString() {
    return "The city " + name + " has a population of: " + population;
  }
}
