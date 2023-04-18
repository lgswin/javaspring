package com.fastcampus.ch3.DB;

import java.util.Date;
import java.util.Objects;

public class User {
    private String id;
    private String name;
    private String pwd;
    private String email;
    private Date birth;
    private String sns;
    private Date reg_date;

    public User() {

    }
    public User(String id, String pwd, String email, Date birth, String sns, Date reg_date) {
        this.id = id;
        this.pwd = pwd;
        this.email = email;
        this.birth = birth;
        this.sns = sns;
        this.reg_date = reg_date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirth() {
        return birth;
    }

    public String getSns() {
        return sns;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", sns='" + sns + '\'' +
                ", reg_date=" + reg_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(pwd, user.pwd) && Objects.equals(email, user.email) && Objects.equals(birth, user.birth) && Objects.equals(sns, user.sns) && Objects.equals(reg_date, user.reg_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pwd, email, birth, sns, reg_date);
    }
}
