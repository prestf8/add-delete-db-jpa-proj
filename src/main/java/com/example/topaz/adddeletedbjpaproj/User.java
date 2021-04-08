package com.example.topaz.adddeletedbjpaproj;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="username")
    private String userName;

    private String password;
    private boolean active;
    private String role;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public String getRole() {
        return role;
    }
}
