package td1exo9;
public class Fidele extends Client {
    public static Client[] liste;
    public Fidele(int numClient, int numSeance, int nbrSeancesAssis){
        super(numClient, numSeance, nbrSeancesAssis);
    }
    /* Le logiciel vérifie l’existence du numéro dans la liste des clients fidèles ainsi que 
    la disponibilité des places et confirme la réservation et le tarif de du billet au client qui le règlera le jour de la projection.*/
    public boolean existEtVerification(Client reservation, Salle salle, Seance seance){
        boolean bool=false;
        for (Client client: liste) {
            if((reservation.numClient == client.numClient) || (salle.getNbrReserv()<=Salle.getCapacite())){
                    if(client.nbrSeancesAssis > 25){
                        seance.setTarif((seance.getTarif()*5)/100);
                    }
                    System.out.println("Réservation validée, tarif : " + seance.getTarif());
                    bool = true;
                    return bool;
            }
         }
        return bool;
    }
}
