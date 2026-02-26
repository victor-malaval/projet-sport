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
    private  LocalDateTime date;
    private int nbplace;
    private List<client> listeinscrits;
    private String dureecours;
    
        public cours(int valcoursID, String valtypecours, String valactivite, LocalDateTime valdate, int valnbplace, String valdureecours){
        this.coursID=valcoursID;
        this.activite=valactivite;
        this.date=valdate;
        this.nbplace=valnbplace;
        this.typecours=valtypecours;
        this.listeinscrits=new ArrayList<>();
        this.dureecours=valdureecours;
                }
        @Override
        public String toString() {
        return "Cours ID : " + coursID +", Activite : " + activite +", Date : " + date 
                +"duree : "+ dureecours+", Places : " + nbplace + ", Type : " + typecours +"Inscrit : "+listeinscrits;
        }

    
                
                
    
            
    
    
    
}
