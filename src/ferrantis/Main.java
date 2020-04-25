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
        OrdenDeCompra ordenCompra1 = empleadoBodega.generarOrdenDeCompra("Tuercas", 5, 20);
        empleadoBodega.verOrdenDeCompra(ordenCompra1);
        
        // Estado de abastecimiento.
        empleadoBodega.estadoDeAbastecimiento(bodega01);
        
        // Instanciamos al vendedor.
        Personal empleado3 = empleador.crearPersonal("Vicente Rodriquez", "Ventas", 'M', 23);
        Vendedor empleadoVentas = new Vendedor(empleado3);
        empleadoVentas.informacionPersonal();
        
        // Metodos del vendedor.
        OrdenDeVenta ordenVenta1 = empleadoVentas.generarOrdenDeVenta("Audi", 100, 100);
        
        // Instanciacion de un mecanico.
        Personal empleado4 = empleador.crearPersonal("Mauricio Salas", "Mecanico", 'M', 29);
        Mecanico empleadoTaller = new Mecanico(empleado4);
        
        // Instanciando un vehiculo.
        Vehiculo vehiculoDePruebas = empleadoTaller.CrearVehiculo("Incompleto", "Ferrari", 20);
        empleadoTaller.estadoVehiculo(vehiculoDePruebas);
        
        // Aplicando metodos del mecanico.
        empleadoTaller.cambiarEstado(vehiculoDePruebas, "Terminado");
        empleadoTaller.estadoVehiculo(vehiculoDePruebas);
        
        // Instanciando al contador.
        Personal empleado5 = empleador.crearPersonal("Sebastian Ramirez", "Contador", 'M', 20);
        Contador empleadoFinanzas = new Contador(empleado5);
        
        Reporte reporte1 = empleadoFinanzas.GenerarReporte(ordenVenta1, vehiculoDePruebas, ordenCompra1);
        empleadoFinanzas.verReporte(reporte1);
        
        // Instanciando al empleado de planta.
        
    };
};
