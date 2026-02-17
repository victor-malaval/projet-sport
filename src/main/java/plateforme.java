
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class plateforme {
    private  List<client> tabclients;
    private List<admin> tabadmin;
    private List<cours> tabcourspasse;
    private List<cours> tabcoursfutur;
    private String Nomfichiersauvegarde;
    private int dureecours;
    
    public plateforme (List<client> valtabclients,List<admin> valtabadmin,List<cours> valtabcourspasse,List<cours> valtabcoursfutur, String valNomfichiersauvegarde,int valdureecours){
        this.Nomfichiersauvegarde=valNomfichiersauvegarde;
        this.dureecours=valdureecours;
        this.tabadmin=valtabadmin;
        this.tabclients=valtabclients;
        this.tabcoursfutur=valtabcoursfutur;
        this.tabcourspasse=valtabcourspasse;
    }
     public String toString(){
        return "liste des clients : " + tabclients + "liste des admins : " + tabadmin + "liste des cours passés : " + tabcourspasse +"liste des cours futurs : "+ tabcoursfutur
                +"duree du cours : "+ dureecours;
    }
     

    
           
    
    
    
    
    }
            




            
    
    
    
            
    
    