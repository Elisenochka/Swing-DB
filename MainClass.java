/**
 * Created by Romych on 01.04.2016.
 */
import java.sql.*;


public class MainClass {
    public static Connection cnn;
    public static Statement stnt;
    public static ResultSet rsSt;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        cnn.Cntn();

        MyWindow mw = new MyWindow();


    public static void Cntn() throws ClassNotFoundException, SQLException {
        cnn = null;
        Class.forName("org.sqlite.JDBC");
        cnn = DriverManager.getConnection("jdbc:sqlte:Swing.db");

        System.out.println("Base is connected");
    }


}


}
