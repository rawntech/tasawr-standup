// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tasawr.standupmanager.domain;

import com.tasawr.standupmanager.domain.Employee;
import com.tasawr.standupmanager.domain.Project;
import java.util.Set;

privileged aspect Project_Roo_JavaBean {
    
    public String Project.getName() {
        return this.name;
    }
    
    public void Project.setName(String name) {
        this.name = name;
    }
    
    public String Project.getDescription() {
        return this.description;
    }
    
    public void Project.setDescription(String description) {
        this.description = description;
    }
    
    public Set<Employee> Project.getInvolved_employees() {
        return this.involved_employees;
    }
    
    public void Project.setInvolved_employees(Set<Employee> involved_employees) {
        this.involved_employees = involved_employees;
    }
    
}
