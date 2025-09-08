package com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Utils;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/registerJSP";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "25082004";

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
}
