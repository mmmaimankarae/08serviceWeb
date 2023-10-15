package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/* annotation Service */
@WebService(serviceName = "HelloWebService")
public class HelloWebService {
    /* annotation Method */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
