package io.threestacks.packerapi.agenda;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


//public class PackerService {
//        public static void main(String args[]) {

//            public void createTable(){
//                Properties prop = new Properties();
//                InputStream input = null;
//                Connection c = null;
//                Statement stmt = null;
//                try {
//                    input = new FileInputStream("src/main/resources/application.properties");
//
//                    prop.load(input);
//                    String user = prop.getProperty("spring.datasource.data-username");
//                    String pass = prop.getProperty("spring.datasource.data-password");
//                    String url = prop.getProperty("spring.datasource.url");
//                    Class.forName("org.postgresql.Driver");
//                    c = DriverManager
//                            .getConnection(url, user, pass);
//                    System.out.println("Opened database successfully");
//
//                    stmt = c.createStatement();
//                    String sql = "CREATE TABLE IF NOT EXISTS agendas " +
//                            "(id          SERIAL PRIMARY KEY ," +
//                            " name        VARCHAR(100) UNIQUE NOT NULL, " +
//                            " agenda      VARCHAR(300) NOT NULL, " +
//                            " complete     BOOL NOT NULL DEFAULT '0')";
//                    stmt.executeUpdate(sql);
//                    stmt.close();
//                    c.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    System.err.println(e.getClass().getName() + ": " + e.getMessage());
//                    System.exit(0);
//                }
//                System.out.println("Table created successfully");

//            },

//            public void createAgenda(Agenda agenda){
//                Properties prop = new Properties();
//                InputStream input = null;
//                Connection c = null;
//                Statement stmt = null;
//                try {
//                    input = new FileInputStream("src/main/resources/application.properties");
//
//                    prop.load(input);
//                    String user = prop.getProperty("spring.datasource.data-username");
//                    String pass = prop.getProperty("spring.datasource.data-password");
//                    String url = prop.getProperty("spring.datasource.url");
//                    Class.forName("org.postgresql.Driver");
//                    c = DriverManager
//                            .getConnection(url, user, pass);
//                    System.out.println("Opened database successfully");
//
//                    stmt = c.createStatement();
//                    String sql = "INSERT INTO agendas (NAME, AGENDA, COMPLETE) VALUES ('test', 'testing', TRUE);";
//                    stmt.executeUpdate(sql);
//
//                    stmt.close();
//                    c.commit();
//                    c.close();
//                } catch (Exception e) {
//                    System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//                    System.exit(0);
//                }
//                System.out.println("Agenda record added successfully");
//
//            }

//        }
//
//},
