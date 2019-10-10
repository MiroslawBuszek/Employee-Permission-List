package com.buszek.controller;

import com.buszek.model.Employee;
import com.buszek.model.Permission;
import com.buszek.repository.EmployeeRepository;
import com.buszek.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository emplRepository;

    @Autowired
    private PermissionRepository permRepository;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/employees")
    public String index(Model model) {
        List<Employee> employees = (List<Employee>) emplRepository.findAll();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @RequestMapping(value = "add")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @RequestMapping(value = "/edit/{id}")
    public String editEmployee(@PathVariable("id") Long employeeId, Model model) {
        model.addAttribute("employee", emplRepository.findById(employeeId));
        return "editEmployee";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Employee employee) {
        emplRepository.save(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("id") Long employeeId, Model model) {
        emplRepository.deleteById(employeeId);
        return "redirect:/employees";
    }

    @RequestMapping(value = "addEmployeePermission/{id}", method = RequestMethod.GET)
    public String addPermission(@PathVariable("id") Long employeeId, Model model) {

        model.addAttribute("permissions", permRepository.findAll());
        model.addAttribute("employee", emplRepository.findById(employeeId).get());
        return "addEmployeePermission";
    }


    @RequestMapping(value = "/employee/{id}/permissions", method = RequestMethod.GET)
    public String employeesAddPermission(@RequestParam(value = "action", required = true) String action, @PathVariable Long id, @RequestParam Long permissionId, Model model) {
        Optional<Permission> permisson = permRepository.findById(permissionId);
        Optional<Employee> employee = emplRepository.findById(id);

        if (employee.isPresent() && action.equalsIgnoreCase("save")) {
            if (!employee.get().hasPermission(permisson.get())) {
                employee.get().getPermissions().add(permisson.get());
            }
            emplRepository.save(employee.get());
            model.addAttribute("employee", permRepository.findById(id));
            model.addAttribute("permissions", permRepository.findAll());
            return "redirect:/employees";
        }

        model.addAttribute("developers", emplRepository.findAll());
        return "redirect:/employees";

    }

    @RequestMapping(value = "getemployees", method = RequestMethod.GET)
    public @ResponseBody
    List<Employee> getEmployees() {
        return (List<Employee>) emplRepository.findAll();
    }
}
