package com.tasawr.standupmanager.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Standup {

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date standup_date;

    @ManyToOne
    private Employee conductor;

    @Size(max = 500)
    private String todays_work;

    @Size(max = 500)
    private String previous_work;

    @Size(max = 500)
    private String blocker;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Employee> employees = new HashSet<Employee>();
}
