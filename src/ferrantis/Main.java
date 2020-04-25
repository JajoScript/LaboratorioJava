package ferrantis;

// Importación de clases.
import areasDeTrabajo.*;
import empleados.*;
import assets.*;

public class Main {
    public static void main(String args[]){
        
        // Instanciación del empleador.
        Administrador empleador = new Administrador("Javier Almarza", 34, 'M');
        empleador.informacionPersonal();
        
        // Instanciando al personal de bodega.
        Personal empleado1 = empleador.crearPersonal("Manolo", "Bodega", 'M', 20);
        empleado1.informacionPersonal();
        
        Personal empleado2 = empleador.crearPersonal("Manuela", "Bodega", 'F', 25);
        empleado2.informacionPersonal();
        
        // Eliminando personal.
        empleador.eliminarPersonal(empleado2); // Chao Manuela U_U
        
        // Asignando empleado a la bodega.
        Bodeguero empleadoBodega = new Bodeguero(empleado1);
        empleadoBodega.informacionPersonal();
        
        // Instanciamos la bodega.
        Bodega bodega01 = new Bodega(20, 50, 60);
        
        // Utilizando los metodos del empleado de bodega.
        empleadoBodega.verStock(bodega01);
        empleadoBodega.verRecursos(bodega01);
        
        bodega01.stock = empleadoBodega.agregarStock(bodega01, 6);
        empleadoBodega.verStock(bodega01);
        
        bodega01.stock = empleadoBodega.eliminarStock(bodega01, 6);
        empleadoBodega.verStock(bodega01);
        
        // instanciando la orden de compra.
        OrdenDeCompra orden1 = empleadoBodega.generarOrdenDeCompra("Tuercas", 5);
        empleadoBodega.verOrdenDeCompra(orden1);
        
        // Estado de abastecimiento.
        empleadoBodega.estadoDeAbastecimiento(bodega01);
        
    };
};
