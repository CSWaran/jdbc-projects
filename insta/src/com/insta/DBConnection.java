package com.insta;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/FBook_DB";
    private static final String USER = "test";
    private static final String PASSWORD = "test";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

