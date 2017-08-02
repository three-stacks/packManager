package io.threestacks.packerapi.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class PackerService {
        public static void main(String args[]) {
            Properties prop = new Properties();
            InputStream input = null;
            Connection c = null;
            Statement stmt = null;
            try {
                input = new FileInputStream("src/main/resources/application.properties");

                prop.load(input);
                String user = prop.getProperty("spring.datasource.data-username");
                String pass = prop.getProperty("spring.datasource.data-password");
                String url = prop.getProperty("spring.datasource.url");
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection(url, user, pass);
                System.out.println("Opened database successfully");

                stmt = c.createStatement();
                String sql = "CREATE TABLE IF NOT EXISTS agendas " +
                        "(id          SERIAL PRIMARY KEY ," +
                        " name        varchar(100) UNIQUE NOT NULL, " +
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
