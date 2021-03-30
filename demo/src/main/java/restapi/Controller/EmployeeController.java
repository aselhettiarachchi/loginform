package restapi.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import restapi.Service.EmployeeService;
import restapi.model.Employee;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")

public class EmployeeController {


@Autowired
    EmployeeService sevice;

@PostMapping("/save")
    public Employee save(@RequestBody Employee emplopyee ){

    sevice.saveOrupdate(emplopyee);
    return emplopyee;
}

@GetMapping("/list")
    public List<Employee>list(){
    return sevice.getAllEmployee();
}
@GetMapping("/list/{id}")
    public Employee getbyId(@PathVariable Long id){
    return  sevice.getByid(id);
}
@DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id")Long id){
    sevice.deleteEmployee(id);
    return "delete succsefully idd ="+id;
}
}
