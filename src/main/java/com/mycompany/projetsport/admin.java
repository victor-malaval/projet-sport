package com.mycompany.projetsport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class admin extends utilisateur{
    
   
    public admin(String valMDP, String valemail){
        super(valMDP, valemail);
    }
    @Override
    public String toString() {
    return "Mot de passe : " + getMDP() +", Email : " + getemail();
    }

    
}