package employeerestfulclient;

import java.io.StringReader;
import java.util.List;
import javax.xml.bind.JAXB;
import model.Employee;
import model.Employees;
import util.EmployeeClient;

public class EmployeeRestfulClient {
    public static void main(String[] args) {
        EmployeeClient empClient = new EmployeeClient();
            /* XML */
        /* String xml = empClient.find_XML(String.class, "2");
         * System.out.println(xml); */
        
        /* Employee emp1 = new Employee();
        emp1.setId(4);
        emp1.setName("Susie");
        emp1.setSalary(1234567.89);
        empClient.create_XML(emp1); */
        
        /* String xmlSearch = empClient.find_XML(String.class, "4");
        Employee empSearch = (Employee) JAXB.unmarshal(new StringReader(xmlSearch), Employee.class);
        empSearch.setSalary(45789.50); */
        
        empClient.remove("4");
        
        String xml = empClient.findAll_XML(String.class);
        Employees emps = (Employees) JAXB.unmarshal(new StringReader(xml), Employees.class);
        List<Employee> empList = emps.getEmployees();
        for (Employee emp : empList) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        }
        
        /* แปลงXML เป็นObject Employee */
        /* Employee emp = (Employee) JAXB.unmarshal(new StringReader(xml), Employee.class);
        System.out.println(emp.getName()); */
        
            /* JSON */
        System.out.println(empClient.countREST());
        String json = empClient.findAll_JSON(String.class);
        System.out.println(json);
    }
}
