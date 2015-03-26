
package gestiondereservation;
import java.util.ArrayList;

public class Personne {
    private String nom;
    private String prenom;
    private String numrue;
    private String nomrue;
    private String ville;
    private String cp;
    private String tel;
    
    public Personne (String n, String pm, String t, String nr, String nomr, String v, String c)
    {
        nom = n;
        prenom = pm;
        numrue = nr;
        nomrue = nomr;
        ville = v;
        cp = c;
        tel=t;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumrue() {
        return numrue;
    }

    public void setNumrue(String numrue) {
        this.numrue = numrue;
    }

    public String getNomrue() {
        return nomrue;
    }

    public void setNomrue(String nomrue) {
        this.nomrue = nomrue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
