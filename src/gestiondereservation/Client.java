package gestiondereservation ;

public class Client extends Personne {
    private int numClient;
    private String login;
    private String mdp;
    public Client (String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp)
    {
        super (n, pm, t, nr, nomr, v, c);
        //numero client auto incrementant et unique
        numClient ++;
        login = log;
       this.mdp=mdp;
        
    }

    public int getNumClient() {
        return numClient;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
