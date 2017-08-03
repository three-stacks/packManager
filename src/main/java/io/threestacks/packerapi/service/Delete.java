package io.threestacks.packerapi.service;

import io.threestacks.packerapi.agenda.Agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Delete {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/travelpack",
                            "djd", "djd");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "DELETE from agendas where ID = 2;";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM agendas;" );
            ArrayList<Agenda> list = new ArrayList<Agenda>();
            while ( rs.next() ) {
                String id = rs.getString("id");
                String  name = rs.getString("name");
                String  agenda = rs.getString("agenda");
//                Boolean  complete = rs.getBoolean("complete");
//                Agenda listItem = new Agenda();
//                listItem.setId(id);
//                listItem.setName(name);
//                listItem.setAgenda(agenda);
//                listItem.setAgenda(complete);

                System.out.println( "id = " + id );
                System.out.println( "name = " + name );
                System.out.println( "agenda = " + agenda );
//                list.add(listItem);
//                System.out.println(list);

            }
//            System.out.println();

            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
