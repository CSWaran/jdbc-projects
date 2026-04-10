package com.Bank;
import java.sql.*;

public class TransactionService {

    public static void deposit(int accId, double amount) throws Exception {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);

        try {
            PreparedStatement ps1 = con.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE id=?"
            );
            ps1.setDouble(1, amount);
            ps1.setInt(2, accId);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(
                "INSERT INTO transactions(account_id, type, amount) VALUES (?, 'DEPOSIT', ?)"
            );
            ps2.setInt(1, accId);
            ps2.setDouble(2, amount);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Deposit success!");

        } catch (Exception e) {
            con.rollback();
        }
    }
}