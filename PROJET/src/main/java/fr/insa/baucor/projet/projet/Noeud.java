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
public abstract class Noeud { //abstract car on ne cree pas de Noeud sans preciser si c'est un NS ou bien un NA donc on aura jamais d'instances(objets) qui appartiennent specifiqut a cette classe
    int idn;
    
    public Noeud(int idn) { //on definit un constructeur principal
        this.idn = idn;
    }
    
    public int getIdn() {
        return idn;
    }
    @Override
    public String toString(){ //pas sure devoir mettre ca -> pour dans barre (idn1 ; idn2) ?
        return "[" + this.idn + "]";
    }    
    //on veut definir le terrain qui contient tous les objets : pour interface graphique, on veut calculer maxX minX maxY minY de chaque objet 
    // methode pour maxX :
    public abstract double calPx(); //abstract car chaque noeud aura une methode partic de calculer son maxX
    public abstract double calPy();
    //public abstract double distanceNoeud(Noeud n); (voir classes NoeudSimple et NoeudAppui pour implentation de la méthode) //pour quand l'utilisateur clique à cote du noeud avoir les coordonnées du noeud le plus proche
    
 
    
}


    