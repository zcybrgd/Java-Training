package exo9;

public class Fidele extends Client {
    private static Client[] liste;
    public boolean reserver(Client reservation){
        boolean bool=false;
        for (Client client: this.liste) {
            if((reservation.numClient == client.numClient)){

            }
         }
        return bool;
    }
}
