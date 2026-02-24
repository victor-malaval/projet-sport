package com.mycompany.projetsport;


import com.mycompany.projetsport.client;
import java.time.LocalDateTime;
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
    
        public cours(int valcoursID, String valtypecours, String valactivite, LocalDateTime valdate, int valnbplace,List<client> vallisteinscrits){
        this.coursID=valcoursID;
        this.activite=valactivite;
        this.date=valdate;
        this.nbplace=valnbplace;
        this.typecours=valtypecours;
        this.listeinscrits=vallisteinscrits;
                }
    
                
                
    
            
    
    
    
}
