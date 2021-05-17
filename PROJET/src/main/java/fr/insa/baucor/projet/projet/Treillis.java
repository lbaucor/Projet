/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.baucor.projet.projet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author louis
 */
public class Treillis {

    private List<TypeBarre> barresPossibles;
    private Terrain leTerrain;
    private List<Noeud> noeuds;
    private List<Barre> barres;

    public Treillis() {
        this.barresPossibles = new ArrayList<TypeBarre>(); //si on ne precise rien lors de la creation du treillis, on le cree avec une liste de type de barre vide
        this.leTerrain = leTerrain;
        this.barres = new ArrayList<Barre>();
        this.noeuds = new ArrayList<Noeud>();
    }
    
    //gerer la relation entre Treillis et Noeud : on dit que l'operation fonda est d'ajouter/enlever un noeud
    public void add(Noeud noeud) {
        this.noeuds.add(noeud);
    }

    public void remove(Noeud noeud) {
        this.noeuds.remove(noeud);
    }

    public void add(Barre barre) {
        this.barres.add(barre);
    }

    public void remove(Barre barre) {
        this.barres.remove(barre);
    }

    public void add(TypeBarre barrepossible) {
        this.barresPossibles.add(barrepossible);
    }

    public void remove(TypeBarre barrepossible) {
        this.barresPossibles.remove(barrepossible);
    }

    ///public static Treillis treilliTest()  { //creer d'abord terrain puis on veut des triangleterrain,    
    //} 
}
