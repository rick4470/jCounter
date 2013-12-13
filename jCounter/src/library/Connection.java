/**
 *
 * @author rick
 */
package library;

public class Connection
{
    private final String os = System.getProperty("os.name");
    private String url;
    private final String dbName = "java";
    private final String userName = "javaUser";
    private final String password = "oHeyJava";
    
    
    public Connection(){}

    /**
     * @return the url
     */
    public String getUrl()
    {
        if(os.startsWith("Windows"))
        {
            url = "jdbc:mysql://localhost:3306/";
        }
        else
        {
            url = "jdbc:mysql://192.168.57.105:3306/";
        }
        return url;
    }

    /**
     * @return the dbName
     */
    public String getDbName()
    {
        return dbName;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }    
}
