package td3exo2;

public interface AugmentationSalaire {
    default double augmenterSalaire(double salaire, double pourcentage) throws AugmentationImpossibleException{
        salaire += salaire*pourcentage;
        if(salaire>200000) throw new AugmentationImpossibleException();
        else { return salaire;}
    }
}

