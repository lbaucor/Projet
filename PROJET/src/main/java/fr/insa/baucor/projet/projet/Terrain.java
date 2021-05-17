/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.baucor.projet.projet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author louis
 */

//Il y a une relation "contient" de Terrain vers TT
//Mais cardinalité max n'est pas 1 : chaque terrain est en relation avec un ensemble de TT
//On peut representer ca dans cette classe comme une liste de TT (ressemble a des tableaux)
public class Terrain { //un terrain est defini par une zone constructible définie par quatre réels
    private List<TriangleTerrain> contient;//chaque terrain contient un ensenble de TT
    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax;
   
    public Terrain (double xmin, double xmax, double ymin, double ymax) {
        //cree un terrain VIDE :
        this.contient = new ArrayList<TriangleTerrain>(); //si on ne precise rien lors de la creation du terrain, on le cree avec une liste de TT vide
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }
    
    public double getXmin() { //get permet d'obtenir, or de la classe Terrain, la valeur de l'attribut xmin ici
        return xmin;
    }    
    public double getXmax() {
        return xmax;
    }
    public double getYmin() {
        return ymin;
    }
    public double getYmax() {
        return ymax;
    }

    @Override
    public String toString() {
        return "[" + this.xmin + "," + this.xmax + ";" + this.ymin + "," + this.ymax + "]" ; //zone constructible
    }
    
        //gerer la relation entre TT  et Terrain : on dit que l'operation fonda est d'ajouter un TT dans un terrain : on fait une methode de Terrain
    public void add(TriangleTerrain tt) { //ajouter un tt
        //cas particuliers:
        if(tt.getTerrain() !=this) { //si terrain est deja le terrain dans lequel je suis j'ai rien a faire, faire quelque chose suelemt si different
            
           if(tt.getTerrain() !=null) { // donc si le tt est pas dans meme terrain et l'autre terrain dans lequel il est est non nul :
               throw new Error("TriangleTerrain deja dans un autre terrain"); 
           }
            //seulemnt dans le cas ou le tt est pas deja dans le terrain et qu'il n'est pas dans un autre terrain qu'on l'ajoute !
           this.contient.add(tt);
           tt.setTerrain(this);
        }    
    } //avec cette methode d'ajout d'un tt dans un terrain on a bien realisé la relation dans les deux sens :
    //on a ajouté le tt au terrain et on a indiquer que le terrain du tt c'est ce terrain la
}

