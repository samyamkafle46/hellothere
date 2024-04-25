package org.pojo.Models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name = "uname")
    private String uName;

    @Column(name = "password")
    private String uPassword;
    @Column(name = "is_admin")
    private boolean uIsAdmin;
    @Column(name = "status")
    private boolean status;
    @Column(name = "email")
    private String email;

    public User(String uName, String uPassword, boolean uIsAdmin, boolean status, String email) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uIsAdmin = uIsAdmin;
        this.status = status;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public boolean isuIsAdmin() {
        return uIsAdmin;
    }

    public void setuIsAdmin(boolean uIsAdmin) {
        this.uIsAdmin = uIsAdmin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
