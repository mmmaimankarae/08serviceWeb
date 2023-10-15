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

@Path("ftoc")
public class FtoC {
    @Context
    private UriInfo context;

    public FtoC() {
        
    }

    @GET
    @Path("{fah}")
    @Produces("application/xml")
    public String getXml(@PathParam("fah") double fah) {
        double cel = (5 / 9.0) * (fah -32);
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setCelsius(cel);
        /* สั่งให้เขียนในรูปของ XML File */
        JAXB.marshal(result, writer);
        return writer.toString();
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
