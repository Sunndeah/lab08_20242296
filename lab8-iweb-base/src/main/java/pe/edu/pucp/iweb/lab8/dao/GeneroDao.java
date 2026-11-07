package pe.edu.pucp.iweb.lab8.dao;

import java.util.ArrayList;
import java.sql.*;
import pe.edu.pucp.iweb.lab8.beans.Genero;

import pe.edu.pucp.iweb.lab8.beans.Genero;

public class GeneroDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todos los géneros ordenados por nombre.
     */
    public ArrayList<Genero> listarTrabajos() {
        // TODO

        ArrayList<Genero> lista = new ArrayList<>();

        String sql = "SELECT * FROM genero ORDER BY nombre";

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()){

            while (rs.next()){
                Genero genero = new Genero();

                genero.setIdGenero((Integer)rs.getObject("idGenero"));
                genero.setNombre(rs.getString("nombre"));

                lista.add(genero);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }



        return lista;
    }
}
