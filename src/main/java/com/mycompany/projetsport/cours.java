package com.mycompany.projetsport;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class cours {

    private int coursID;
    private String typecours;
    private String activite;
    private LocalDateTime date;
    private int nbplace;
    private List<client> listeinscrits;
    private String dureecours;

    public cours(int valcoursID, String valtypecours, String valactivite, LocalDateTime valdate, int valnbplace, String valdureecours) {
        this.coursID = valcoursID;
        this.activite = valactivite;
        this.date = valdate;
        this.nbplace = valnbplace;
        this.typecours = valtypecours;
        this.listeinscrits = new ArrayList<>();
        this.dureecours = valdureecours;
    }

    @Override
    public String toString() {
        return "Cours ID : " + coursID + ", Activite : " + activite + ", Date : " + date
                + ", duree : " + dureecours + ", Places : " + nbplace + ", Type : " + typecours + ", Inscrit : " + afficherInscritsResume();
    }
    public String afficherInscritsResume() {

        String res = "";

        for (client c : listeinscrits) {
            res += "[ID: " + c.getnumero()
                    + ", Nom: " + c.getnom()
                    + ", Prenom: " + c.geteprenom() + "] ";
        }

        return res;
    }

    public double getTauxRemplissage() {

    if (nbplace == 0) {
        return 0;
    }

    return ((double) listeinscrits.size() / nbplace) * 100;
}

    public List<client> getlisteinscrits() {
        return listeinscrits;
    }

    public String getactivite() {
        return activite;
    }

    public int getcoursID() {
        return coursID;
    }

    public int getnbplace() {
        return nbplace;
    }
    public LocalDateTime getdate(){
        return date;
    }
    


    public void setCoursID(int coursID) {
        this.coursID = coursID;
    }

    public void setTypecours(String typecours) {
        this.typecours = typecours;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setNbplace(int nbplace) {
        if (nbplace >= 0) {
            this.nbplace = nbplace;
        } else {
            System.out.println("Le nombre de places ne peut pas etre negatif.");
        }
    }


   
    public void setDureecours(String dureecours) {
        this.dureecours = dureecours;
    }

        
    

    
}
