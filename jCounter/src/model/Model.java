/**
 *
 * @author rick
 */
package model;

import library.Connection;
import java.sql.SQLException;

public class Model extends AbstractModel
{
    @Override
    public void loadRowByPrimaryKey(Object id) throws SQLException{}
    
    public Model()
    {
        this.loadConnection();
    }

    @Override
    public final void loadConnection()
    {
        this.myConnection = new Connection();
    }
}
