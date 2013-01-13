package com.tasawr.standupmanager.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Project {

    private String name;

    @Size(max = 500)
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Users> InvlovedUsers = new HashSet<Users>();
}
