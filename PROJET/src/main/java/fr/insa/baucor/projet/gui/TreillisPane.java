/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.baucor.projet.gui;

/**
 *
 * @author louis
 */
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class TreillisPane extends BorderPane {

    private Controleur control;

    private Button bNoeud;
    private Button bBarre;
    //private TextArea taMessage; //on a pas besoin d'écire ?
    private Button bSelect;
    private Button bTypeBarre;
    private Button bTerrain;

    private Button bRassembler;
    private Button bSupprimer;
    private Button bCouleur;

    private DessinCanvas cDessin;

    public TreillisPane() {
        this.control = new Controleur(); //pour que ca ne s'attribue que a une seule fenetre
        this.bNoeud = new Button("Noeud");
        this.bNoeud.setOnAction((t) -> { //setOnAction: pour cliquer 
            this.control.boutonNoeud(t);
        });
        this.bBarre = new Button("Barre");
        this.bBarre.setOnAction((t) -> {
            this.control.boutonBarre(t);
        });
        this.bSelect = new Button("Select");
        this.bSelect.setOnAction((t) -> {
            this.control.boutonSelect(t);
        });
        this.bCouleur = new Button("Couleur");
        this.bCouleur.setOnAction((t) -> {
            this.control.boutonColor(t);
        });
        this.bRassembler = new Button ("Rassembler");
        this.bRassembler.setOnAction((t) -> {
            this.control.boutonRassembler(t);
        });
        this.bTypeBarre = new Button ("Type Barre");
        this.bTypeBarre.setOnAction((t) -> {
            this.control.boutonTypeBarre(t);
        });
        this.bTerrain = new Button ("Terrain");
        this.bTerrain.setOnAction((t) -> {
            this.control.boutonTerrain();
        });
        
        HBox entete = new HBox(this.bNoeud, this.bBarre, this.bTypeBarre, this.bTerrain, this.bSelect, this.bCouleur, this.bRassembler); //Hbox un conteneur horizontal / VBox vertical

        this.setTop(entete);

        /*this.taMessage = new TextArea("ceci est un \n super programme");
        this.taMessage.setOnMouseClicked((t) -> {
            this.control.sourisDansZoneTexte(t);
        });
        this.setCenter(this.taMessage);*/
        
        this.cDessin = new DessinCanvas(500, 500);
        this.setCenter(this.cDessin);

    }
}
