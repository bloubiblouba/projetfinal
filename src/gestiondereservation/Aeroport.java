package gestiondereservation;
import java.util.ArrayList;

public class Aeroport {
    private String numero_aeroport;
    private String nom_aeroport;
    private String adresse;
    private String telephone;
    private ArrayList<Vol> TabVols;
    
public Aeroport (String num_a, String nom_a, String ad, String tel){
    numero_aeroport = num_a;
    nom_aeroport = nom_a;
    adresse = ad;
    telephone = tel;
    TabVols = new ArrayList();
}

    public String getNumero_aeroport() {
        return numero_aeroport;
    }

    public void setNumero_aeroport(String numero_aeroport) {
        this.numero_aeroport = numero_aeroport;
    }

    public String getNom_aeroport() {
        return nom_aeroport;
    }

    public void setNom_aeroport(String nom_aeroport) {
        this.nom_aeroport = nom_aeroport;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Vol> getTabVols() {
        return TabVols;
    }

    public void setTabVols(ArrayList<Vol> TabVols) {
        this.TabVols = TabVols;
    }

    

}
