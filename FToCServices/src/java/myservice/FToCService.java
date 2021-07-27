/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sarun
 */
@WebService(serviceName = "FToCService")
public class FToCService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fToC")
    public double fToC(@WebParam(name = "fah") double fah) {
        //TODO write your implementation code here:
        double cel = (5/9.0) * (fah - 32);
        return cel;
    }

    /**
     * This is a sample web service operation
     */
    
}
