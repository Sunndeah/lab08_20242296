package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Cancion;
import pe.edu.pucp.iweb.lab8.beans.Genero;

public class CancionDao extends BaseDao{ // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */
    public ArrayList<Cancion> listarCancion() {

        ArrayList<Cancion>lista = new ArrayList<>();

        String sql = "Select c.idcancion, c.titulo, g.idgenero, g.nombre FROM cancion e "

        return new ArrayList<>();
    }

    /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO
        return null;
    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        // TODO
    }
}
