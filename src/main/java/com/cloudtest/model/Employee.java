package com.cloudtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by admin on 2017/7/3.
 */
@Data
@AllArgsConstructor
public class Employee {
    private String empId;
    private String name;
    private String designation;
    private double salary;
}
