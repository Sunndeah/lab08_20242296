package pe.edu.pucp.iweb.lab8.beans;

/**
 * Ejercicio 2: bean Cancion.
 */
public class Cancion {

    private String idCancion;
    private String titulo;
    private String artista;
    private int duracionSeg;
    private int anio;
    private genero genero;


    // TODO: atributos idCancion, titulo, artista, duracionSeg, anio
    //          y genero (de tipo Genero)

    // TODO: getters y setters

    /**
     * TODO: retornar la duración en formato m:ss
     *          (354 segundos -> "5:54", 200 segundos -> "3:20").
     */
    public String getDuracionFormateada() {
        return null;
    }

    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public genero getGenero() {
        return genero;
    }

    public void setGenero(genero genero) {
        this.genero = genero;
    }
}
