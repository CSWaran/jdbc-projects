package com.Bank;

import java.sql.*;

public class CreateAccount {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        String sql = "INSERT INTO accounts(name, balance) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "John");
        ps.setDouble(2, 1000);

        ps.executeUpdate();
        System.out.println("Account created!");
    }
}
