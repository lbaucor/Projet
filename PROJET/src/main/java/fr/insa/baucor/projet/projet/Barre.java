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
//barre ( idb ; idtb ; idn1 ; idn2)
public class Barre { //relation entre barre et noeuds de 1 sens : barre vers noeud : depuis une barre je veux connaître les deux noeuds qu'elle relie
    private Noeud n1; //chaque barre est en relation avec 2 noeuds (ses extrémités)  -> attribut de type Noeud
    private Noeud n2;
    private int idb;
    private TypeBarre tb;
    
    //Constructeurs qu'on veut fournir :
    //constructeur principal:
    public Barre (Noeud n1, Noeud n2, int idb, TypeBarre tb) {
        this.idb= idb;
        this.n1 = n1;
        this.n2 = n2;
        this.tb = tb;
    }
    
    //constructeur supplementaire : couleur ?
 
    //encapsulation -> grace aux methodes d'acces(accesseurs) :
    //on veut acceder aux info des deux noeuds que relie la barre : lire : get :
    public Noeud getN1(){
        return n1;  
    }
    public Noeud getN2() {
        return n2;
    }
    //logiciel veut pas permettre de modifier les barres, on fait pas les "set" pour l'instant
    public int getIdb() {
        return idb;
    }
    public TypeBarre getTb(){
        return tb;
    }
   
    public String toString() {
        return "[" + this.n1 + "," + this.n2 + "," + idb + "," + tb + "]"; 
    }
}
