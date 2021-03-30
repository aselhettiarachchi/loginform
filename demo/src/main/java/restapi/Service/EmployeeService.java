package restapi.Service;

import restapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee>getAllEmployee();

    public Employee getByid(Long id);

    public  void saveOrupdate(Employee employee);

    public void deleteEmployee(Long id);
}
