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

//relation entre NA et TT : un NA se trouve sur un segment de TT 
public abstract class NoeudAppui extends Noeud {
    private TriangleTerrain tt; //chaque NA est en relation avec un TT : attribut TT, i est le numero de TT
    //j numero du somment qui est le debut du segment de trianggle sur lequele est le noeud est -> j entre 0 et 2 (ptj = pt0 ou pt1 ou pt2)
    //private double k; // k = (j+1)mod3 permet d'avoir le point d'apres
    //private double x; // x entre 0 et 1
    private double alpha;// position du noeud est donnee par P=alpha*p + (1-x)*ptk 
    private Segment s;
    
    
    public NoeudAppui(int idn, TriangleTerrain tt, double alpha, Segment s){
        super(idn);
        this.tt = tt;
        this.alpha = alpha;
        this.s = s;
        
    }
    
    public TriangleTerrain getTt(){
        return tt;
    }
    
    @Override
    public double calPx() { //calcul position de l'appui sur segment
        double p1 = this.s.getDebut().getPx(); //abscisse du début du segment
        double p2 = this.s.getFin().getPx();
        return this.alpha * p2 + (1-this.alpha) * p1;
    }
    @Override
    public double calPy() { //calcul position de l'appui sur segment
        double p1 = this.s.getDebut().getPy();
        double p2 = this.s.getFin().getPy();
        return this.alpha * p2 + (1-this.alpha) * p1;
    }
    /*public double distanceNoeud(Noeud n) {
       double p1=this.s.getDebut().getPx();
       double p2=this.s.getFin().getPy();
       double p3=this.n.getPx();
       double p4=this.s.getFin().getPy();
    }*/
    
    @Override
    public String toString() {
        return "(" + idn + "," + this.tt + "," + this.s + ")"; //?????
        
    }
    

    // alpha entre 0 et 1 
    
    //comment faire classe AppuiSimple et AppuiDouble telles qu'elles heritent de cette classe ??
    
    
    
}
