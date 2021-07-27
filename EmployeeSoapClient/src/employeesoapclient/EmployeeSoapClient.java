/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeesoapclient;

import client.Employee;

/**
 *
 * @author sarun
 */
public class EmployeeSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = findEmployeeById(1);
        System.out.println(emp.getName());
        emp.setName("Prayuth");
        updateEmployee(emp);
        
    }

    private static Employee findEmployeeById(int id) {
        client.EmployeeService_Service service = new client.EmployeeService_Service();
        client.EmployeeService port = service.getEmployeeServicePort();
        return port.findEmployeeById(id);
    }

    private static int updateEmployee(client.Employee emp) {
        client.EmployeeService_Service service = new client.EmployeeService_Service();
        client.EmployeeService port = service.getEmployeeServicePort();
        return port.updateEmployee(emp);
    }
    
}
