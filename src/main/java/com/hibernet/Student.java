package com.hibernet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private String s_name;
    private String domain;


    public void setSid() {
        this.sid = sid;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", s_name='" + s_name + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }


}
