/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellosoapclnt;

/**
 *
 * @author sarun
 */
public class HelloSOAPClnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(hello("Sarun"));
    }

    private static String hello(java.lang.String name) {
        services.HelloService_Service service = new services.HelloService_Service();
        services.HelloService port = service.getHelloServicePort();
        return port.hello(name);
    }
    
}
