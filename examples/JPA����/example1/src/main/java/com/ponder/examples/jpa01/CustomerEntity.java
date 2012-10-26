package com.ponder.examples.jpa01;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name="Customer")
public class CustomerEntity implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @Column(name="name",nullable=false)
    private String name;
    @Column(name="password",nullable=false)
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
