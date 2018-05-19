package rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.Response;

import dataaccess.DataAccessLocal;
import domain.Cities;

@Stateless
@Path("/city")
public class CityResource{
	
  public CityResource() {}

  @Inject
  private DataAccessLocal dal;

  @GET
  @Produces({"application/JSON"})
  @Path("{cityId}")
  public Response findCityByName( @PathParam("cityId") String name ) {
    try {
      String result = dal.getCityByName(name);
      return Response.ok(result).build();
    } catch ( Exception e ) {
      return Response.status(403).build();
    }
  }
  
  @GET
  @Produces({"application/JSON"})
  public Response showAllCities() {
	  try {
		  List<Cities> result = dal.showAllCities();
		  return Response.ok(result).build();
	  } catch ( Exception e ) {
		  return Response.status(425).build();
	  }
  }
  
	@POST
	@Produces("application/JSON")
	@Consumes("application/JSON")
	public Cities addCity(Cities city) {
		try {
			dal.addCity(city);
		} catch (ServiceUnavailableException e) {
			e.printStackTrace();
		}
		return city;
	}
  
  @DELETE
  @Path("{city}")
  public Response deleteEmployee( @PathParam("city") String name) {
	  try {
		  dal.removeCity(name);
		  return Response.status(200).build();
	  } catch ( Exception e ) {
		  return Response.status(404).build();
	  }
  }	
  
  @PUT
  public void updateCity(@QueryParam("name") String name, @QueryParam("newName") String newName, @QueryParam("population") Integer population ) {
	  dal.updateCity(name, newName, population);
  }

}