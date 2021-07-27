/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.io.StringWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXB;
import model.Result;

/**
 * REST Web Service
 *
 * @author sarun
 */
@Path("ftoc")
public class FtoC {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FtoC
     */
    public FtoC() {
    }

    /**
     * Retrieves representation of an instance of service.FtoC
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{fah}")
    @Produces("application/xml")
    public String getXml(@PathParam("fah") double fah) {
        double cel = (5 / 9.0) * (fah -32);
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setCelsius(cel);
        JAXB.marshal(result, writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of FtoC
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
