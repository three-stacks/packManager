package io.threestacks.packerapi.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/travelpack",
                            "postgres", "123");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO agendas (NAME, AGENDA, COMPLETE) VALUES ('renew', 'passport', TRUE);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO agendas (NAME, AGENDA, COMPLETE) VALUES ('toothbrush', 'get toiletries', TRUE);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO agendas (NAME, AGENDA, COMPLETE) VALUES ('work', 'finish payroll', TRUE);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO agendas (NAME, AGENDA, COMPLETE) VALUES ('packup', 'pack everything', FALSE );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}
