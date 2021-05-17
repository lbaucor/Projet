/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.baucor.projet.gui;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author louis
 */
public class Controleur {

    public void boutonNoeud(ActionEvent t) {
        System.out.println("bouton noeud cliqué");
    }

    void sourisDansZoneTexte(MouseEvent t) {
        System.out.println("vous avez cliqué en " + t.getX() + " , " + t.getY());
    }

    void boutonSelect(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void boutonColor(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void boutonRassembler(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void boutonTypeBarre(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void boutonBarre(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void boutonTerrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
