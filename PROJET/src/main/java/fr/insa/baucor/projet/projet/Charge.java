/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.baucor.projet.projet;

/**
 *
 * @author louis
 */
public class Charge {

    public double chargex;
    public double chargey;

    public double getChargex() {
        return chargex;
    }

    public void setChargex(double chargex) {
        this.chargex = chargex;
    }

    public double getChargey() {
        return chargey;
    }

    public void setChargey(double chargey) {
        this.chargey = chargey;
    }

    public Charge ajout(Charge charge1) {
        Charge res;
        res = new Charge(); 
        res.chargex = this.chargex + charge1.chargex;
        res.chargey = this.chargey + charge1.chargey;
        return res;
    }

    public Charge appui() {
        this.chargex = 0;
        this.chargey = 0;
        return this;
    }

    public Charge() {
        this.chargex = 0.0;
        this.chargey = 0.0;
    }

    public String toString() {
        return "charge de x : " + this.chargex + "\n charge de y :" + this.chargey;
    }

}

