package empleados;
// Importacion de clases.
import assets.*;

// Creacion de la clase mecanico.
public class Mecanico extends Personal{
    // Atributos.
    
    // Constructor.
    public Mecanico(Personal a) {
        super(a.nombre, a.area, a.edad, a.sexo);
    };
    
    // Metodos.
    public void estadoVehiculo(Vehiculo a){
        System.out.println("==============");
        System.out.println("El estado del vehiculo es: "+ a.estado);
        System.out.println("==============");
    };
    
    public Vehiculo CrearVehiculo(String e, String m, int vB){
        Vehiculo a = new Vehiculo(e, m, vB);
        return a;
    };
    
    public void cambiarEstado(Vehiculo v, String e){
        v.estado = e;
    };
    
    // Getters & Setters.
}
