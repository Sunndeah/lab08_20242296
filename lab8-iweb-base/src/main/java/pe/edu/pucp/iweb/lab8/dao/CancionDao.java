package pe.edu.pucp.iweb.lab8.dao;

import pe.edu.pucp.iweb.lab8.beans.Cancion;
import pe.edu.pucp.iweb.lab8.beans.Genero;

import java.sql.*;
import java.util.ArrayList;



public class CancionDao extends BaseDao{ // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */
    public ArrayList<Cancion> listarCancion() {

        ArrayList<Cancion>lista = new ArrayList<>();

        String sql = "Select c.idcancion, c.titulo, g.idgenero, g.nombre FROM cancion c INNER JOIN genero g ON g.idgenero = c.idcancion ";

        try(Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){

            while(rs.next()){
                Cancion cancion = new Cancion ();
                Genero genero = new Genero ();

                cancion.setIdCancion(rs.getString("idcancion"));
                cancion.setTitulo(rs.getString("titulo"));

                genero.setIdGenero(rs.getInt("genero_id"));
                genero.setNombre(rs.getString("nombre"));

                cancion.setGenero(genero);

                lista.add(cancion);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return lista;
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

        String sql = "INSERT INTO canciones (idcancion, titulo) VALUES (?, ?)";

        try (Connection conn = this.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cancion.getIdCancion());
            ps.setString(2, cancion.getTitulo());

            ps.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }

    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        String sql = "UPDATE jobs SET job_title = ? WHERE job_id = ?";

        try (Connection conn = this.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cancion.getIdCancion());
            ps.setString(2, cancion.getTitulo());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        String sql = "DELETE FROM jobs WHERE job_id = ?";

        try (Connection conn = this.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCancion);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
