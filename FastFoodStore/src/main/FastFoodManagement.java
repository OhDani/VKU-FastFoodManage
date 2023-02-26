package main;

import view.Login;
import view.Management;

import java.sql.Connection;

public class FastFoodManagement {
    public static void main(String[] args) {
//        Login lo= new Login("QUẢN LÍ CỬA HÀNG ĐỒ ĂN NHANH");
       // lo.showWindow();
        Management ma =new Management();
        Connection conn = TestSQLConnection.getConnect("LAPTOP-0TRU1A0I\\NGOC", "RIN");
        if (conn != null) {
            System.out.println("Connected");
        }
        else {
            System.out.println("Failed");
        }
    }
}
