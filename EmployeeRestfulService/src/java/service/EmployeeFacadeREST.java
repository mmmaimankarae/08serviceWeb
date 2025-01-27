package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Employee;

@Stateless
@Path("model.employee")
public class EmployeeFacadeREST extends AbstractFacade<Employee> {

    @PersistenceContext(unitName = "EmployeeRestfulServicePU")
    private EntityManager em;

    public EmployeeFacadeREST() {
        super(Employee.class);
    }
    /* CREATE */
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Employee entity) {
        super.create(entity);
    }
    /* EDIT */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Employee entity) {
        super.edit(entity);
    }
    /* REMOVE */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
    /* PUSH DATA (ดึงข้อมูล) */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Employee find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("name/{name}") /* ทำPath ให้แตกต่างจากid ไม่งั้นid จะทำงานไม่ได้ */
    @Consumes((MediaType.TEXT_PLAIN)) /* TEXT ธรรมดา */
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Employee> findByName(@PathParam("name") String name) {
        Query query = getEntityManager().createNamedQuery("Employee.findByName");
        query.setParameter("name", name);
        List<Employee> empList = (List<Employee>) query.getResultList();
        return empList;
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Employee> findAll() {
        return super.findAll();
    }
    /* ระบุช่วงที่ต้องการจะดึงข้อมูล */
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Employee> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }
    /* นับว่ามีกี่Record ในDatabase */
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
