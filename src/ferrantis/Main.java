package ferrantis;

// Importación de clases.
import areasDeTrabajo.*;
import empleados.*;
import assets.*;

public class Main {
    public static void main(String args[]){
        // Instanciación del empleado.
        Administrador empleador = new Administrador("Javier Almarza", 20, 'M');
        empleador.datosAdministrador();
        empleador.informacionPersonal();
    };
};
