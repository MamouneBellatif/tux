package game;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.io.File;

public class Partie {

    private String date;
    private String mot;
    private int niveau;
    private int trouvé;
    private int temps;

    public Partie(String date, String mot, int niveau) {
        this.date=date;
        this.mot=mot;
    }
    
    public Partie(Element partieElit){

    }

    public Element getPartie(Document doc){
        return null;
    }
    public void setTrouve(int nbLettresRestantes){
        // trouvé=mot.length()-nbLettresRestantes;
        trouvé=(mot.length()-nbLettresRestantes)/mot.length()*100;
    }

    public void setTemps(int temps){
        this.temps=temps;
    }

    public int getNiveau(){
        return niveau;
    }

    public String getMot(){
        return mot;
    }

    public String toString(){
        return "Mot: "+mot+" Date: "+date+" Trouvé: "+trouvé+" Temps: "+temps;
    }
    
}
