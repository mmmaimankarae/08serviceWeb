package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 + num2;
    }
}

