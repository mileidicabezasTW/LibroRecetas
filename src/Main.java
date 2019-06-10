import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){

        PasoReceta introduccion = new PasoIntroduccion();
        PasoPreparacion preparacion = new PasoPreparacion();
        preparacion.setOrdenPasoPreparacion(1);
        preparacion.setDescripcion("Batir los huevos ");
        preparacion.setTiempo(5);
        introduccion.setDescripcion("Esta es una super receta");

        List<PasoReceta> pasos = new ArrayList<>();
        pasos.add(introduccion);
        pasos.add(preparacion);

        for (PasoReceta paso: pasos ) {
            System.out.println(paso);

        }
    }
}
