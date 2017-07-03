package com.cloudtest.controllers;

import com.cloudtest.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/7/3.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {
        Employee emp = new Employee("emp1","manager", "1", 3000);

        return emp;
    }
}
