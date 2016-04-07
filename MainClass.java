/**
 * Created by Romych on 01.04.2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Arrays;


public class MainClass {
    static String name = "Swing.db";
static String shName="Swing";
    static String tableName = "DataBase";
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static String[] logins = new String[5];
    static String[] firstNames = new String[5];
    static String[] names = new String[5];
    static String[] lastNames = new String[5];
    static Integer[] numbers = new Integer[5];

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        DataBase.Cntn();
        DataBase.CrtDB(tableName);
        logins[0]="fis";
        firstNames[0]="From";
        names[0]="Ire";
        lastNames[0]="Som";
        numbers[0]=890823;
        //System.out.println(Arrays.toString(values));
        DataBase.WriteDB(tableName,logins,firstNames,names,lastNames,numbers);
        MyWindow mw = new MyWindow();
}


}
