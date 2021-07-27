/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sarun
 */
@XmlRootElement(name="employees")
public class Employees {
    List<Employee> employees;
    public List<Employee> getEmployees() {
        return employees;
    }
   @XmlElement(name="employee")
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void add(Employee employee) {
        if (this.employees == null) {
            this.employees = new ArrayList<Employee>();
        }
        this.employees.add(employee);
    }
    
}
