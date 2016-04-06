/**
 * Created by Romych on 01.04.2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


public class MainClass {
    static String name = "Swing.db";

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static String[] values = new String[5];


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataBase.Cntn();
        values[0]="fis";
        values[1]="From";
        values[2]="Ire";
        values[3]="Som";
        values[4]="890823";
        DataBase.WriteDB(name,values);


        MyWindow mw = new MyWindow();


}


}
