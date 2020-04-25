package areasDeTrabajo;
// Importacion de clases.
import assets.*;

// Creacion de la clase taller
public class Taller {
    // Atributos.
    public String estadoProduccion;
    
    // Constructor.
    public Taller(Vehiculo v){
        if(v.estado == "Completado"){
            this.estadoProduccion = "Detenido";
        }
        else {
            this.estadoProduccion = "Trabajando";
        }
    }
    // Metodos.
    
    // Getters & Setters.
    
}
