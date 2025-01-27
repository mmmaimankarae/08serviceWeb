package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* รับString XML แล้วแปลงเป็นList */
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
