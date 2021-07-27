/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeerestfulclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Employee;
import util.EmployeeClient;

/**
 *
 * @author sarun
 */
public class EmployeeRestfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EmployeeClient empClient = new EmployeeClient();
       //System.out.println(empClient.countREST());
        //String json = empClient.findAll_JSON(String.class);
        //System.out.println(json);
       empClient.remove("5");
        String xml = empClient.findAll_XML(String.class);
        System.out.println(xml);
        xml = empClient.find_XML(String.class, "1");
        System.out.println(xml);
        //Employee emp = (Employee) JAXB.unmarshal(new StringReader(xml), Employee.class);
        //System.out.println(emp.getName());
        /*Employees emps = (Employees) JAXB.unmarshal(new StringReader(xml), 
                Employees.class);
        List<Employee> empList = emps.getEmployees();
        for (Employee emp : empList) {
            System.out.println(emp.getId() + " " + emp.getName() + " " +
                    emp.getSalary());
        }*/
        /*StringWriter writer = new StringWriter();
        JAXB.marshal(emps, writer);
        System.out.println(writer);*/
        /*xml = empClient.find_XML(String.class, "3");
        Employee emp = (Employee) JAXB.unmarshal(new StringReader(xml), Employee.class);
        emp.setSalary(500000.75);
        empClient.edit_XML(emp, "3");
        xml = empClient.find_XML(String.class, "3");
        System.out.println(xml);
        emp = (Employee) JAXB.unmarshal(new StringReader(xml), Employee.class);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());*/
        
    }
    
}
