// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tasawr.standupmanager.domain;

import com.tasawr.standupmanager.domain.UserRoles;
import javax.persistence.Column;

privileged aspect UserRoles_Roo_DbManaged {
    
    @Column(name = "uesr_role", length = 100)
    private String UserRoles.uesrRole;
    
    public String UserRoles.getUesrRole() {
        return uesrRole;
    }
    
    public void UserRoles.setUesrRole(String uesrRole) {
        this.uesrRole = uesrRole;
    }
    
}