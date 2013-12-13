/**
 *
 * @author Ric
 */
package library;

import java.sql.SQLException;
import model.AuthenticationModel;

public class AuthenticationFactory 
{
    public static AuthenticationHelper CreateInstance()
    {
        AuthenticationModel data = new AuthenticationModel();

        AuthenticationHelper helper = new AuthenticationHelper(data);

        return helper;
    }

    public static AuthenticationHelper CreateInstance(int id) throws SQLException
    {
        AuthenticationModel data = new AuthenticationModel();

        data.loadRowByPrimaryKey(id);

        AuthenticationHelper helper = new AuthenticationHelper(data);

        return helper;
    }
}
