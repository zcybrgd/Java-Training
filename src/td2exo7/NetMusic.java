package td2exo7;

public class NetMusic {
    static int nbrClients=0;
    static int nbrComptes=0;
    private static Compte[] comptes;
    private static Client[] clients;
    private Catalogue catalogue;
    public Client[] getClients() {
        return clients;
    }
    public static Compte[] getComptes() {
        return comptes;
    }
    public static void setClients(Client[] clients) {
        NetMusic.clients = clients;
    }
    public static void setComptes(Compte[] comptes) {
        NetMusic.comptes = comptes;
    }
    public void ajouterUnClient(Client client){
        Client[] newClients = new Client[nbrClients+1];
        if(nbrClients==0){
            newClients[0] = client;
        }else{
            for (int i = 0; i < clients.length; i++) {
                newClients[i] = clients[i];
            }
        }
        nbrClients++;
        newClients[nbrClients-1] = client;
        setClients(newClients);
    }
    public void ajouterUnCompte(Compte compte){
        Compte[] newComptes = new Compte[nbrComptes+1];
        if(nbrComptes==0){
            newComptes[0] = compte;
        }else{
            for (int i = 0; i < comptes.length; i++) {
                newComptes[i] = comptes[i];
            }
        }
        nbrComptes++;
        newComptes[nbrComptes-1] = compte;
        setComptes(newComptes);
    }
    


    // check si le client est existant dans la liste des clients
    boolean clientExistant(Client client){
        boolean exist=false;
        if(getClients()==null){
            return exist;
        }
        for(Client c : getClients()){
            if((c.getNom().equals(client.getNom()))&&(c.getPrenom().equals(client.getPrenom()))&&(c.getAdr().equals(client.getAdr()))){
                return true;
            }
        }
        return exist;
    }
    // check si le compte est existant dans la liste des comptes
    boolean compteExistant(Compte compte){
        boolean exist=false;
        if(getComptes()==null){
            return exist;
        }
        for(Compte c : getComptes()){
            if((c.getUsername().equals(compte.getUsername()))){
                return true;
            }
        }
        return exist;
    }
}
