import java.util.List;

public class Receta {
    private String nombreReceta;
    private String descripcionReceta;
    private List<PasoReceta> listaPasos;
    private List<Ingredientes> listaIngresientes;

    private String imagenURL;


    public Receta() {

    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setDescripcionReceta(String descripcionReceta) {
        this.descripcionReceta = descripcionReceta;
    }

    public String getDescripcionReceta() {
        return descripcionReceta;
    }

    public List<PasoReceta> getListaPasos() {
        return listaPasos;
    }

    public void setListaPasos(List<PasoReceta> listaPasos) {
        this.listaPasos = listaPasos;
    }

    public void setListaIngresientes(List<Ingredientes> listaIngresientes) {
        this.listaIngresientes = listaIngresientes;
    }

    public List<Ingredientes> getListaIngresientes() {
        return listaIngresientes;
    }
}
