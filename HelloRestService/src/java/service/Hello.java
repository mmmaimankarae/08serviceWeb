package service;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXB;

@Path("hello")
public class Hello {
    @Context
    private UriInfo context;

    public Hello() {
        
    }

    @GET
    @Path("(name)")
    @Produces(MediaType.APPLICATION_XML)
        /* รับParameter name map ในชื่อ name */
    public String getXml(@PathParam("name") String name) {
        /* ส่วนของการสร้างXML ที่มีTag ชื่อString */
        StringWriter writer = new StringWriter();
        /* write กลับไปในรูปของXML */
        JAXB.marshal("Hello " + name, writer);
        return writer.toString();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
