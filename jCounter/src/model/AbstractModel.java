/**
 * @author Vlad
 * @author rick
 */
package model;

import library.Connection;
import library.loads;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractModel<T> implements loads
{
    protected Connection myConnection;
    private java.sql.Connection db = null;
    public Boolean IsLoaded = false;

    public void closeConnection() throws SQLException
    {
        if(null != db)
        {
            db.close();
        }
    }
    
    
    public void executeInsertUpdateDeleteQuery(String sqlStatement)
    {
        try
        {
            GetLiveQuery().executeUpdate(sqlStatement);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AbstractModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ResultSet executeSelectQuery(String sqlStatement)
    {
        ResultSet data = null;
        try
        {
            data = GetLiveQuery().executeQuery(sqlStatement);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AbstractModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }

    private Statement GetLiveQuery()
    {
        Statement query = null;

        try
        {
            db = DriverManager.getConnection(myConnection.getUrl() + myConnection.getDbName(), myConnection.getUserName(), myConnection.getPassword());
            query = (Statement) db.createStatement();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AbstractModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return query;
    }
}
