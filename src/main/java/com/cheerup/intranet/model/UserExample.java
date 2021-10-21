package com.cheerup.intranet.model;

import java.io.Serializable;
import java.util.Date;

//serializable : utils quand l'objet subit une transformation de representation (ex: json <-> objet, objet <-> bdd)
public class UserExample implements Serializable {
    private Long id;

    private String userName;
    private String password;

    private String firstName;
    private String lastName;
    private String email;

    private Date lastLoginDate;

    private String[] roles;
    private String[] authorities;

    private boolean isActive;
    private boolean isNotLocked;
}
