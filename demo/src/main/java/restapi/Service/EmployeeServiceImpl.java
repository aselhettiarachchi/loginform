package restapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.Service.EmployeeService;
import restapi.model.Employee;
import restapi.repostory.EmployeeRepostory;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepostory repostory;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repostory.findAll();
    }

    @Override
    public Employee getByid(Long id) {
        return repostory.findById(id).get();
    }

    @Override
    public void saveOrupdate(Employee employee) {
        repostory.save(employee);

    }

    @Override
    public void deleteEmployee(Long id) {
repostory.deleteById(id);
    }
}
