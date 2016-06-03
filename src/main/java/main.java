/**
 * Created by Francis Cáceres on 29/5/2016.
 */

import freemarker.template.Configuration;
import org.h2.jdbcx.JdbcConnectionPool;
import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String [] args) throws Exception{

        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(main.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine( configuration );

        DataBase base = new DataBase();


        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello Francis");
            attributes.put("estudiantes",base.listar());

            return new ModelAndView(attributes, "inicio.ftl");
        }, freeMarkerEngine);

        get("/agregar", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello Francis");


            return new ModelAndView(attributes, "agregar.ftl");
        }, freeMarkerEngine);

        post("/agregar", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            int mat = Integer.parseInt(request.queryParams("matricula"));
            String nom = request.queryParams("Nombre");
            String ape = request.queryParams("Apellido");
            String tel = request.queryParams("Telefono");
            String car = request.queryParams("Carrera");

            Estudiante est = new Estudiante(mat,nom,ape,tel,car);
            base.insertar(est);
            return new ModelAndView(attributes, "agregar.ftl");
        }, freeMarkerEngine);


        get("/editar", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello Francis");


            return new ModelAndView(attributes, "editar.ftl");
        }, freeMarkerEngine);

    }




}



