package com.tasawr.standupmanager.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findUsersesByUsernameEquals" })
public class Users {

    @NotNull
    @Size(min = 3, max = 6)
    private String username;

    @NotNull
    @Size(max = 100)
    private String password;

    private Boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Roles> roles = new HashSet<Roles>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Project> projects = new HashSet<Project>();
}
