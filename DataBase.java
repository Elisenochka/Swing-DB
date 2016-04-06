import java.sql.*;
import java.util.Arrays;
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

    /*public static void getRowAmount(){
        stnt=cnn.createStatement();

        while(rsSt.next())
        return RowId
    }*/


    public final static void Cntn() throws ClassNotFoundException, SQLException{
        cnn = null;
        Class.forName("org.sqlite.JDBC");
        cnn = DriverManager.getConnection("jdbc:sqlite:Swing.db");
        stnt = cnn.createStatement();

        System.out.println("Base is connected");
    }

    public static void CrtDB(String name) throws ClassNotFoundException, SQLException{

        stnt.execute("CREATE TABLE if not exsists "+name+ "('ID','Login','First name','Name','Last name', 'Number')");

        System.out.println("DataBase is created");
    }

    public static void WriteDB(String name, String values[]) throws SQLException{
        stnt.execute("INSERT INTO "+ name+"('Login','First name','Name','Last name', 'Number') VALUES ("+ Arrays.toString(values)+")");

        System.out.println("Table is filled");

    }

    public static void WriteDB(String name) throws SQLException{
        stnt.execute("INSERT INTO "+ name+"('Login','First name','Name','Last name', 'Number') VALUES ('fis','Fire','Indis','Same','23874904')");

        System.out.println("Table is filled");

    }



}
