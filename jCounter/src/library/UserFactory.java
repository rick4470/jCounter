/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.sql.SQLException;
import model.AppUserModel;

public class UserFactory 
{
    public static UserHelper CreateInstance()
    {
        AppUserModel data = new AppUserModel();

        UserHelper user = new UserHelper(data);

        return user;
    }

    public static UserHelper CreateInstance(int userId) throws SQLException
    {
        AppUserModel data = new AppUserModel();

        data.loadRowByPrimaryKey(userId);

        UserHelper user = new UserHelper(data);

        return user;
    }
    
    public static UserHelper CreateInstanceLoadByLicenseID(int id) throws SQLException
    {
        AppUserModel data = new AppUserModel();

        data.loadRowByLicenseId(id);

        UserHelper user = new UserHelper(data);

        return user;
    }
}
