import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Created by Romych on 05.04.2016.
 */
public class DataBase {
    public static Connection cnn;
    public static Statement stnt;
    public static ResultSet rsSt;


    public final static void Cntn() throws ClassNotFoundException, SQLException{
        cnn = null;
        Class.forName("org.sqlite.JDBC");
        cnn = DriverManager.getConnection("jdbc:sqlte:Swing.db");

        System.out.println("Base is connected");
    }

    public static void CrtDB(String name) throws ClassNotFoundException, SQLException{
        stnt = cnn.createStatement();
        stnt.execute("CREATE TABLE if not exsists '%s' ('ID','Name')");

        System.out.println("DataBase is created");
    }



}
