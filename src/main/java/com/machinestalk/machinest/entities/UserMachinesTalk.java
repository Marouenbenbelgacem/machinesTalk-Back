package com.machinestalk.machinest.entities;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserMachinesTalk {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
           private Long id;
           private String name;
            private String userName;
           private String email ;
           private String address;

    public UserMachinesTalk(Long id, String name, String userName, String email, String address) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
