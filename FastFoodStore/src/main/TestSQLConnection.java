package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestSQLConnection {

    public static Connection getConnect(String stringServer, String stringDB) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://"+stringServer+":1433;databaseName="+stringDB+";encrypt=true;trustServerCertificate=true;";
            String user = "ttmngoc";
            String pass = "123";
            //
            conn = DriverManager.getConnection(connectURL,user,pass);
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("SQL Exception: "+e.toString());
        }
        return conn;
    }
}
