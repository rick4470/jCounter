/**
 *
 * @author rick
 */

package library;

import java.sql.SQLException;

public interface loads<T>
{
    public abstract void loadRowByPrimaryKey(T id) throws SQLException;
    public abstract void loadConnection();
}
