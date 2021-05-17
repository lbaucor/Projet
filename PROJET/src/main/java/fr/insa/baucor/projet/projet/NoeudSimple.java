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
public class NoeudSimple extends Noeud { //extends: on indique c'est un cas partic de Noeud
    //on definit ses attributs en privé
    private Point n; //chaque NoeudSimple est en relation avec un seul point -> attribut de type Point!
    
    //comment on initialise un NoeudSimple(notion de constructeur):
    //contructeur permet de declarer et d'initialiser les donnees membres de la classe (l operateur "new" fait appel à cette methode)
    //Comme NoeudSimple est un cas part de Noeud : lors de la creation d'un NS il faut creer un Noeud
    public NoeudSimple(Point n, int idn) {
        super(idn);//premiere instruct est l'appel d'un constructeur de la super classe: on initialise le NS avec l'id
        this.n = n;
    }
   
    
    //encapsulation : quels sont les accés que je vais donner à mes attributs, or de la classe elle-meme?
    /*L'encapsulation d'une classe interdit d'accéder à ses attributs depuis l'extérieur, mais elle autorise d'y accéder indirectement via des méthodes. Les méthodes jouant ce rôle sont appelées des accesseurs*/
    //accesseurs en lecture(get: pour lire valeurs): j'en ai besoin : pour un point donné je veux savoir ses coordonnees
    //accesseurs en ecriture(set: pour modifier valeurs): je vais avoir envie de deplacer des objets, donc modifier leur coordonnes: on definit des accesseurs d'ecriture
    //Un accesseur est une méthode permettant de récupérer le contenu d'une donnée membre protégée.
    //les accesseurs correspondants :
    public Point getN() { //get permet d obtenir la valeur de l'attribut 
        return n;
    }

    //quand on definit des objets on veut pouvoir les afficher:
    //il faut donc definir une methode toString
    @Override
    public String toString() {
        return "(" + idn + "," + this.n + ")";   //il y avait un rpobleme avec id -> me disait que acces privé dans noeud
    }

    @Override
    public double calPx() { //pour avoir position de l'appui  Px sur segment
        return this.n.getPx(); 
     }

    @Override
    public double calPy() {
        return this.n.getPy();
    }

   /* @Override
    public double distanceNoeud(Noeud n) {
        //il faut prendre distance euclidienne, pas compris
    }*/

    
}
