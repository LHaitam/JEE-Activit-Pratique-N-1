package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    public double getData(){
        System.out.println("Version capteurs");
        double temp = 200;
        return temp;
    }
}
