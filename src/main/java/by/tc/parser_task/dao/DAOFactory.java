package by.tc.parser_task.dao;

import by.tc.parser_task.dao.impl.DaoImpl;


/**
 * Created by Y50-70 on 22.11.2017.
 */
public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final ParseDAO parseDao = new DaoImpl();

    private DAOFactory(){}

    public ParseDAO getParseDao(){
        return parseDao;
    }
    public static DAOFactory getInstance(){
        return instance;
    }
}
