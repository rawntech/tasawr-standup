// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tasawr.standupmanager.domain;

import com.tasawr.standupmanager.domain.UserRoles;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect UserRoles_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager UserRoles.entityManager;
    
    public static final EntityManager UserRoles.entityManager() {
        EntityManager em = new UserRoles().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long UserRoles.countUserRoleses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM UserRoles o", Long.class).getSingleResult();
    }
    
    public static List<UserRoles> UserRoles.findAllUserRoleses() {
        return entityManager().createQuery("SELECT o FROM UserRoles o", UserRoles.class).getResultList();
    }
    
    public static UserRoles UserRoles.findUserRoles(Integer roleId) {
        if (roleId == null) return null;
        return entityManager().find(UserRoles.class, roleId);
    }
    
    public static List<UserRoles> UserRoles.findUserRolesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM UserRoles o", UserRoles.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void UserRoles.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void UserRoles.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            UserRoles attached = UserRoles.findUserRoles(this.roleId);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void UserRoles.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void UserRoles.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public UserRoles UserRoles.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        UserRoles merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
