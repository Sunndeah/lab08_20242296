package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Ejercicio 2: DAO base.
 *
 *  - Esta clase debe ser ABSTRACTA.
 *  - GeneroDao y CancionDao deben heredar de ella y obtener la conexión
 *    únicamente con getConnection().
 */


public abstract class BaseDao { // TODO: convertir en clase abstracta
    public Connection getConnection() throws SQLException {
        // TODO: cargar el driver (com.mysql.cj.jdbc.Driver) y retornar la conexión
        throw new UnsupportedOperationException("getConnection() aún no implementado");
        try{
            Class.forName("com.mysql.cj.jdbs.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String user ="root";
        String pass ="12345678";
        String url ="jdbc:mysql://localhost:3306/melodiape";
        return DriverManager.getConnection(url,user,pass);

    }
}
