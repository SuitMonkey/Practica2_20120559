
import org.h2.jdbcx.JdbcConnectionPool;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Francis Cáceres on 3/6/2016.
 */
public class DataBase {

    public void creandoTabla() throws SQLException {
        Connection con = inicioConexion();

        String sql = "CREATE TABLE IF NOT EXISTS ESTUDIANTE\n" +
                "(\n" +
                "  MATRICULA INTEGER PRIMARY KEY NOT NULL,\n" +
                "  NOMBRE VARCHAR(50) NOT NULL,\n" +
                "  APELLIDO VARCHAR(50) NOT NULL,\n" +
                "  TELEFONO VARCHAR(25) NOT NULL,\n" +
                "  CARRERA VARCHAR(50) NOT NULL\n" +
                ");";
        try {
            Statement statement = con.createStatement();
            statement.execute(sql);
            statement.close();
             con.close();
        } catch( SQLException e ){
            System.out.print( e.getMessage() );
        }
    }

    public  ArrayList<Estudiante> listar() throws SQLException {
        Connection con = inicioConexion();

        Statement stmt = con.createStatement();
        String sql = "SELECT MATRICULA, NOMBRE, APELLIDO, TELEFONO, CARRERA FROM ESTUDIANTE";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Estudiante> listEst = new ArrayList<Estudiante>();
        while(rs.next()){
            Integer  MATRICULA = rs.getInt("MATRICULA");
            String  NOMBRE = rs.getString("NOMBRE");
            String APELLIDO = rs.getString("APELLIDO");
            String TELEFONO = rs.getString("TELEFONO");
            String CARRERA = rs.getString("CARRERA");
            listEst.add(new Estudiante(MATRICULA,NOMBRE,APELLIDO,TELEFONO,CARRERA));
        }
        rs.close();
        stmt.close();
        con.close();


        return listEst;

    }


    public void insertar(Estudiante est) throws SQLException {
        Connection con = inicioConexion();

        try {

            String query = "insert into estudiante(matricula, nombre, apellido, telefono, carrera) values(?,?,?,?,?)";

            PreparedStatement prepareStatement = con.prepareStatement(query);
            //Antes de ejecutar seteo los parametros.
            prepareStatement.setInt(1, est.getMatricula());
            prepareStatement.setString(2, est.getNombre());
            prepareStatement.setString(3, est.getApellido());
            prepareStatement.setString(4, est.getTelefono());
            prepareStatement.setString(5, est.getCarrera());
            //
            prepareStatement.executeUpdate();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Connection inicioConexion()  {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        JdbcConnectionPool cp = JdbcConnectionPool.
                create("jdbc:h2:~/Pracica2", "sa", "");
        Connection con = null;
        try {
            con = cp.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }


}
