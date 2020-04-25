package empleados;

// Importacion de clases.
import assets.*;
import areasDeTrabajo.*;

// Creación de la clases bodeguero.
public class Bodeguero extends Personal{
    // Atributos
    
    // Constructor.
    public Bodeguero(Personal n){
        super(n.nombre, n.area, n.edad, n.sexo);
    }
    
    // Metodos
    public void verStock(Bodega bodega){
        System.out.println("==============");
        System.out.println("El stock disponible es: " + bodega.stock);
        System.out.println("==============");
    }
    
    public void verRecursos(Bodega bodega){
        System.out.println("==============");
        System.out.println("Los recursos disponibles son: " + bodega.recursos);
        System.out.println("==============");
    }
    // Atributos.
    
}
