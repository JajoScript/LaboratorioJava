package ferrantis;

// Importación de clases.
import areasDeTrabajo.*;
import empleados.*;
import assets.*;

public class Main {
    public static void main(String args[]){
        
        // Instanciación del empleador.
        Administrador empleador = new Administrador("Javier Almarza", 34, 'M');
        
        empleador.datosAdministrador();
        empleador.informacionPersonal();
        
        // Instanciando al personal de bodega.
        Personal empleado1 = empleador.crearPersonal("Manolo", "Bodega", 'M', 20);
        empleado1.informacionPersonal();
        
        Personal empleado2 = empleador.crearPersonal("Manuela", "Bodega", 'F', 25);
        empleado2.informacionPersonal();
        
        // Eliminando personal.
        empleador.eliminarPersonal(empleado2); // Chao Manuela U_U
        
        
    };
};
