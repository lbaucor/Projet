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

public class Segment {
    private Point debut; //chaque segment est en relation avec 2 point (ses extremitées) -> attribut de type Point
    private Point fin;
    
    //Constructeurs qu'on veut fournir :
    //constructeur principal:
    public Segment(Point debut, Point fin) {
        this.debut = debut;
        this.fin = fin;
    }
    
    //constructeur supplementaire : ?
    
    //encapsulation -> grace aux methodes d'acces(accesseurs) :
    //on veut acceder aux info de debut et de fin : lire : get :
    public Point getDebut(){
        return debut;  
    }
    public Point getFin() {
        return fin;
    }
    //logiciel veut pas permettre de modifier les segments, on fait pas les set pour l'instant
   
    @Override
    public String toString() {
        return "[" + this.debut + "," + this.fin + "]"; 
    }
    
}
