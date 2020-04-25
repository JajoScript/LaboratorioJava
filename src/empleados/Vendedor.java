package empleados;
// Importacion de clases.
import assets.*;

// Creacion de la clase Vendedor.
public class Vendedor extends Personal{
    // Atributos.
    
    // Constructor.
    public Vendedor(Personal a) {
        super(a.nombre, a.area, a.edad, a.sexo, a.profesion, a.funcion);
    }
    
    // Metodos.
    public OrdenDeVenta generarOrdenDeVenta(String m, int vB, int vM){
        OrdenDeVenta orden = new OrdenDeVenta(m, vB, vM);
        System.out.println("==============");
        System.out.println("Se genero una orden de venta: ");
        System.out.println("* Modelo de auto: "+ m);
        System.out.println("* Modelo de auto: "+ vB);
        System.out.println("* Valor de las modificaciones: "+ vM);
        System.out.println("==============");
        
        return orden;
    };
    // Getters & Setters.
}
