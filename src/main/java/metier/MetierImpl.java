package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao; //couplage faible
    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*294/Math.cos(temp*Math.PI);//c'est n'importe quoi juste un exemple de traitement
        return res;
    }

    /*
    Injecter dans la variable dao un objet
    d'une classe qui implémente l'interface IDao
    */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
