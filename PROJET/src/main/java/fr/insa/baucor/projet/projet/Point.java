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
public class Point {
    private double px;
    private double py;
    
    public Point (double px, double py){
        this.px=px;
        this.py=py;
    }
    
//constructeur supplementaire: si on donne pas de coordonnées au point, alors on veut le point (0,0)
    public Point() {
        this(0,0);
    }
    
    //encapsulation : quels sont les accés que je vais donner à mes attributs, or de la classe elle-meme?
    /*L'encapsulation d'une classe interdit d'accéder à ses attributs depuis l'extérieur, mais elle autorise d'y accéder indirectement via des méthodes. Les méthodes jouant ce rôle sont appelées des accesseurs*/
    //accesseurs en lecture(get: pour lire valeurs): j'en ai besoin : pour un point donné je veux savoir ses coordonnees
    //accesseurs en ecriture(set: pour modifier valeurs): je vais avoir envie de deplacer des objets, donc modifier leur coordonnes: on definit des accesseurs d'ecriture
    //Un accesseur est une méthode permettant de récupérer le contenu d'une donnée membre protégée.
    //les accesseurs correspondants :
    public double getPx() { //get permet d obtenir la valeur de l'attribut px
        return px;
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    
    public double getPy() {
        return py;
    }
    
    public void setPy(double py) {
        this.py = py;
    }
    
    //quand on definit des objets on veut pouvoir les afficher:
    //il faut donc definir une methode toString
    
    @Override
    public String toString() {
        return "(" + this.px + "," + this.py + ")";   
    }
    
}
