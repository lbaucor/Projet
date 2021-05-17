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

//relation entre TT et Point, dans un sens : depuis un TT on veut connaître son triplet de points
public class TriangleTerrain { 
    private int idt;
    private Point pt0; //un TT est defini par un triplet de point(pt1, pt2, pt3) (qui definissent donc 3 segments associés)
    private Point pt1;
    private Point pt2;
    private Terrain terrain; //chaque TT est en relation avec 1 seul terrain  -> attribut de type terrain 
   //valeur nulle si pas de terrain associé
    
    public TriangleTerrain (int idt,Point pt0, Point pt1, Point pt2, Terrain terrain){
        this.idt = idt;
        this.pt0 = pt0;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.terrain = terrain;
        
    }
    public Point getPt0() {
        return pt0;
    }
    public Point getPt1() {
        return pt1;
    }
    public Point getPt2() {
        return pt2;
    }
    public int getIdt() {
        return idt;
    }

//il faut que la relation entre TT et terrain reste coherente: il faut gerer simulta la valeur de ces deux attributs qui sont dans 2 classes diff
//dans quelle classe gerer la relation? on dit que l'operation fonda est d'ajouter un TT dans un terrain : on fait une methode de terrain
    //on se rajoute un acces lecture pour acceder au terrain du TT dans class Terrain
    public Terrain getTerrain() {
       return terrain;
    }
    //de mm, un acces ecriture pour methode Terrain "relation TT et Terrain": on veut ajouter TT dans terrain, donc modifier un terrain
    void setTerrain (Terrain terrain) { //enlever modificateur d'acces public -> cette methode n'est accessible que dans les autres classes du mm package
       this.terrain = terrain;
    }
    
   /* //methode pour ajouter un appui sur un tt 
    public void add(NoeudAppui NA){
        if (NA.getTt() != this){
            if (NA.getTt() != null){
                throw new Error("Noeud d'Appui est sur un triangle terrain");
            }
            this..add(NA);
            
        }
    }*/
    
    @Override
    public String toString() {
        return "[" + this.pt0 + "," + this.pt1 + "," + this.pt2 + "," + idt + "]" ;
    }
    

}

