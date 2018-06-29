package ua.lviv.iot;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/insurance_java")
public class InsuranceService implements Serializable {

    @Inject
    private SalesManager salesManager;

    private static Map<Integer, Insurance> insuranceMap = new HashMap<>();
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Insurance getInsurance(@PathParam("id") Integer id){
        return insuranceMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createInsurance(Insurance insurance) {
        insuranceMap.put(insurance.getId(), insurance);
        return Response.status(200).entity("Ok").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response deleteInsurance(@PathParam("id") Integer id){
        insuranceMap.remove(id);
        return Response.status(200).entity("Ok").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateInsurance(Insurance insurance){
        insuranceMap.put(insurance.getId(), insurance);
        return Response.status(200).entity("Ok").build();
    }
}


