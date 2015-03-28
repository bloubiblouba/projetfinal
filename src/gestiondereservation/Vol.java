package gestiondereservation;
import java.util.ArrayList;
import java.util.Date;

public class Vol {
    private String numero_vol;
    private String date_depart;
    private String date_arrivee;
    private String heure_depart;
    private String heure_arrivee;
    private String prix_premiere_classe;
    private String quantite_premiere;
    private String prix_seconde_classe;
    private String quantite_seconde;
    private ArrayList<Reservation>tab_reservation;
    private Aeroport aeroOri;
    private Aeroport aeroDest;
    
public Vol (String nv, String dd, String da, String hd, String ha, String px1, String q1, String px2, String q2,Aeroport ori,Aeroport dest ){
    numero_vol = nv;
    date_depart = dd;
    date_arrivee = da;
    heure_depart = hd;
    heure_arrivee = ha;
    prix_premiere_classe = px1;
    quantite_premiere = q1;
    prix_seconde_classe = px2;
    quantite_seconde = q2;
    tab_reservation = new ArrayList();
    aeroOri = ori;
    aeroDest = dest;
}

    public String getNumero_vol() {
        return numero_vol;
    }

    public void setNumero_vol(String numero_vol) {
        this.numero_vol = numero_vol;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public String getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(String date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public String getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(String heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public String getPrix_premiere_classe() {
        return prix_premiere_classe;
    }

    public void setPrix_premiere_classe(String prix_premiere_classe) {
        this.prix_premiere_classe = prix_premiere_classe;
    }

    public String getQuantite_premiere() {
        return quantite_premiere;
    }

    public void setQuantite_premiere(String quantite_premiere) {
        this.quantite_premiere = quantite_premiere;
    }

    public String getPrix_seconde_classe() {
        return prix_seconde_classe;
    }

    public void setPrix_seconde_classe(String prix_seconde_classe) {
        this.prix_seconde_classe = prix_seconde_classe;
    }

    public String getQuantite_seconde() {
        return quantite_seconde;
    }

    public void setQuantite_seconde(String quantite_seconde) {
        this.quantite_seconde = quantite_seconde;
    }

    public ArrayList<Reservation> getTab_reservation() {
        return tab_reservation;
    }

    public void setTab_reservation(ArrayList<Reservation> tab_reservation) {
        this.tab_reservation = tab_reservation;
    }

    public Aeroport getAeroOri() {
        return aeroOri;
    }

    public void setAeroOri(Aeroport aeroOri) {
        this.aeroOri = aeroOri;
    }

    public Aeroport getAeroDest() {
        return aeroDest;
    }

    public void setAeroDest(Aeroport aeroDest) {
        this.aeroDest = aeroDest;
    }

    
  

  
    
}
