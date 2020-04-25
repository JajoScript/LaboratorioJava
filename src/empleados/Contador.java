
package empleados;
// Importacion de clases.
import assets.*;

// Creacion de la clase contador.
public class Contador extends Personal{
    // Atributos.
    // Constructor.
    public Contador(Personal n){
        super(n.nombre, n.area, n.edad, n.sexo);
    };
    
    // Metodos.
    public Reporte GenerarReporte(OrdenDeVenta oV, Vehiculo v, OrdenDeCompra oC){
        Reporte reporte = new Reporte(oV, v, oC);
        
        return reporte;
    }
    
    public void verReporte(Reporte r){
        System.out.println("==============");
        System.out.println("El reporte mensual: ");
        System.out.println("* Ganancias: +"+ r.valorBase);
        System.out.println("* Gastatos: -"+ r.gastos);
        System.out.println("* Total = "+ r.total);
        System.out.println("==============");
    };
    
    // Getters & Setters.
}
