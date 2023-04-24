package ext;

import dao.IDao;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version WS");
        return 49;
    }
}
