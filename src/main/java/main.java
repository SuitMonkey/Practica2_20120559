/**
 * Created by Francis Cáceres on 29/5/2016.
 */

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String [] args) throws Exception{

        Class.forName("org.h2.Driver");
        creandoTabla();

        //staticFileLocation("/publico");
        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello Francis");

            return new ModelAndView(attributes, "inicio.ftl");
        }, new FreeMarkerEngine());

    }
    public static void creandoTabla() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS ESTUDIANTE\n" +
                "(\n" +
                "  MATRICULA INTEGER PRIMARY KEY NOT NULL,\n" +
                "  NOMBRE VARCHAR(50) NOT NULL,\n" +
                "  APELLIDO VARCHAR(50) NOT NULL,\n" +
                "  TELEFONO VARCHAR(25) NOT NULL,\n" +
                "  CARRERA VARCHAR(50) NOT NULL\n" +
                ");";
        try {
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/practica2", "sa", "");
            Statement statement = con.createStatement();
            statement.execute(sql);
            statement.close();
            con.close();
        } catch( SQLException e ){
            System.out.print( e.getMessage() );
        }
    }

}



