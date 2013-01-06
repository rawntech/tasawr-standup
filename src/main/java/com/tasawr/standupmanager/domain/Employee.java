package com.tasawr.standupmanager.domain;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findEmployeesByNameIsNull", "findEmployeesByNameEquals" })
public class Employee {

    @Size(max = 50)
    protected String name;

    @Size(max = 50)
    protected String email;

    @Size(max = 50)
    protected String designation;

    @Size(max = 100)
    protected String address;

    @ManyToOne
    protected UserRoles user_role;

    @Column(unique = true)
    @Size(min = 4, max = 10)
    private String username;

    @Size(min = 4, max = 10)
    private String password;

    @AssertTrue
    private Boolean enabled;
}
