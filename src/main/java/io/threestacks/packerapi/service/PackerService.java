package io.threestacks.packerapi.service;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    public class PackerService {
        public static void main(String args[]) {
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/travelpack",
                                "trob", "trob");
                System.out.println("Opened database successfully");

                stmt = c.createStatement();
                String sql = "CREATE TABLE agenda " +
                        "(agenda_ID INT PRIMARY KEY NOT NULL," +
                        " NAME        varchar(100) NOT NULL, " +
                        " agenda      varchar(300) NOT NULL, " +
                        " complete     BOOL NOT NULL DEFAULT '0')";
                stmt.executeUpdate(sql);
                stmt.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
            System.out.println("Table created successfully");
        }
    }