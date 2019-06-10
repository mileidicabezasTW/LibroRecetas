import java.util.Date;

public class PasoPreparacion extends PasoReceta {
    private int tiempo;
    private int ordenPasoPreparacion;

    public PasoPreparacion( ){

    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setOrdenPasoPreparacion(int ordenPasoPreparacion) {
        this.ordenPasoPreparacion = ordenPasoPreparacion;
    }

    public int getOrdenPasoPreparacion() {
        return ordenPasoPreparacion;
    }

    @Override
    public String toString() {
        return ordenPasoPreparacion+". "+ getDescripcion()+" ("+getTiempo()+" minutos)";
    }
}


