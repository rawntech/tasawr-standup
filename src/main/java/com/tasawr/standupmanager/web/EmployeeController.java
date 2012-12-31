package com.tasawr.standupmanager.web;

import com.tasawr.standupmanager.domain.Employee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employees")
@Controller
@RooWebScaffold(path = "employees", formBackingObject = Employee.class)
public class EmployeeController {
}
