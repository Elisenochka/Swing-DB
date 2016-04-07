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
        //stnt = cnn.createStatement();
        stnt.execute("CREATE TABLE if not exists '"+ name+ "' ('ID' INTEGER PRIMARY KEY AUTOINCREMENT,'Login' TEXT,'First_name' TEXT,'Name' TEXT,'Last_name' TEXT, 'Number' INT)");

        System.out.println("DataBase is created");
    }

    public static void WriteDB(String name, String logins[],String firstNames[],String names[],String lastNames[], Integer numbers[]) throws SQLException{

        //for (int i=0;i<logins.length;i++) {
        int i=0;
            try {
                PreparedStatement pStnt=cnn.prepareStatement("INSERT INTO 'DataBase' ('Login','First_name','Name','Last_name', 'Number') VALUES (?,?,?,?,?)");
            //pStnt.setString(1,name);
                pStnt.setString(1,logins[i]);
                pStnt.setString(2,firstNames[i]);
                pStnt.setString(3,names[i]);
                pStnt.setString(4,lastNames[i]);
                pStnt.setInt(5,numbers[i]);
                pStnt.execute();
            //stnt.execute("INSERT INTO " + name + " ('Login','First name','Name','Last name', 'Number') VALUES (" + logins[i] + ", "+ firstNames[i]+", "+ names[i] + ", " +lastNames[i]+", "+numbers[i] +")");
            } catch (SQLException e) {
            e.printStackTrace();
            }
        //}

        System.out.println("Table is filled");

    }

    public static void WriteDB(String name) throws SQLException{
        stnt.execute("INSERT INTO "+ name+"('Login','First_name','Name','Last_name', 'Number') VALUES ('fis','Fire','Indis','Same','23874904')");

        System.out.println("Table is filled");

    }



}
