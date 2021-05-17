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
public class TypeBarre {
    private int idtb;
    private double cout;
    private double lgmin;
    private double lgmax;
    private double restr;
    private double rescom;
    
    public TypeBarre (int idtb, double cout, double lgmin, double lgmax, double restr, double rescom){
        this.idtb=idtb;
        this.cout=cout;
        this.lgmin=lgmin;
        this.lgmax=lgmax;
        this.restr=restr;
        this.rescom=rescom;
    }
     //autres constructeurs ? 
    
    public int getIdtb(){
        return idtb;
    }
    //besoin des autres dans autres classes ou non?
    
    public String toString(){
        return "[" + this.idtb + "," + this.lgmin + "," + this.lgmax + "," + this.restr + "," + this.rescom + "]";
    }
}
