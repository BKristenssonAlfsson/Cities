package rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import dataaccess.DataAccessLocal;
import domain.City;

@Stateless
@Path("/city")
public class CityResource {

  @Inject
  private DataAccessLocal dal;

  @GET
  @Produces({"application/JSON", "application/XML"})
  @Path("{cityId}")
  public Response findcityById( @PathParam("cityId") int id ) {
    try {
      String result = dal.getCityById(id);
      return Response.ok(result).build();
    } catch ( Exception e ) {
      return Response.status(403).build();
    }
  }
}
