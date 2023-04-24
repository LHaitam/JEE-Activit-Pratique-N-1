package presentation;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {

    /*
    Injection des dépendances
    par instanciation statique => new
    */
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat "+metier.calcul());
    }
}
