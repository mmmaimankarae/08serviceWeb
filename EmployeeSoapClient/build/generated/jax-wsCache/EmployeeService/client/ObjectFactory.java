
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindEmployeeByIdResponse_QNAME = new QName("http://myservice/", "findEmployeeByIdResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://myservice/", "updateEmployee");
    private final static QName _FindEmployeeById_QNAME = new QName("http://myservice/", "findEmployeeById");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://myservice/", "updateEmployeeResponse");
    private final static QName _Employee_QNAME = new QName("http://myservice/", "employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindEmployeeByIdResponse }
     * 
     */
    public FindEmployeeByIdResponse createFindEmployeeByIdResponse() {
        return new FindEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link FindEmployeeById }
     * 
     */
    public FindEmployeeById createFindEmployeeById() {
        return new FindEmployeeById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice/", name = "findEmployeeByIdResponse")
    public JAXBElement<FindEmployeeByIdResponse> createFindEmployeeByIdResponse(FindEmployeeByIdResponse value) {
        return new JAXBElement<FindEmployeeByIdResponse>(_FindEmployeeByIdResponse_QNAME, FindEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice/", name = "findEmployeeById")
    public JAXBElement<FindEmployeeById> createFindEmployeeById(FindEmployeeById value) {
        return new JAXBElement<FindEmployeeById>(_FindEmployeeById_QNAME, FindEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

}
