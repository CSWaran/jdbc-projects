package com.Fbook;

import java.sql.*;
import java.util.Scanner;

public class createAcc {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/Fbook","test","test");

        String q = "insert into Quizapp values(?,?)";
        PreparedStatement ps = con.prepareStatement(q);

        Scanner sc = new Scanner(System.in);
        System.out.print("Create Username: ");
        String u = sc.nextLine();
        System.out.print("Create Password: ");
        String p = sc.nextLine();

        ps.setString(1,u);
        ps.setString(2,p);
        ps.executeUpdate();

        System.out.println("Account Created");
        con.close();
    }
}