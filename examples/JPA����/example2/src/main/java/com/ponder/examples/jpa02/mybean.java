/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ponder.examples.jpa02;

import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Killko Hon
 */
public class mybean {
    //Inject persistence unit here
    private EntityManagerFactory emf;

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //bala-bala here
}
