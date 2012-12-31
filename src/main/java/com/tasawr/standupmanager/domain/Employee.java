package com.tasawr.standupmanager.domain;

import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Employee {

    @Size(max = 50)
    private String name;

    @Size(max = 50)
    private String email;

    @Size(max = 50)
    private String designation;

    @Size(max = 100)
    private String address;
}
