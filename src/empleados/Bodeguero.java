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
    };
    
    // Metodos
    public void verStock(Bodega bodega){
        System.out.println("==============");
        System.out.println("El stock disponible es: " + bodega.stock);
        System.out.println("==============");
    };
    
    public void verRecursos(Bodega bodega){
        System.out.println("==============");
        System.out.println("Los recursos disponibles son: " + bodega.recursos);
        System.out.println("==============");
    };
    
    public int agregarStock(Bodega bodega, int n){
        int nuevoStock = bodega.stock + n;
        System.out.println("==============");
        System.out.println("Se agregaron "+ n+ " unidades al stock." );
        System.out.println("==============");
        return nuevoStock;
    };
    
    public int eliminarStock(Bodega bodega, int n){
        int nuevoStock = bodega.stock - n;
        System.out.println("==============");
        System.out.println("Se quitaron "+ n+ " unidades al stock." );
        System.out.println("==============");
        return nuevoStock;
    };
    
    public void verOrdenDeCompra(OrdenDeCompra o){
        System.out.println("==============");
        System.out.println("Se genero la orde de compra por: ");
        System.out.println("* Articulo: "+ o.articulo);
        System.out.println("* Cantidad: "+ o.cantidad);
        System.out.println("* Total: "+ o.valor);
        System.out.println("==============");
    };
    
    public OrdenDeCompra generarOrdenDeCompra(String a, int c, int v){
        OrdenDeCompra orden = new OrdenDeCompra(a, c, v);
        
        return orden;
    };
    
    public void estadoDeAbastecimiento(Bodega b){
        System.out.println("==============");
        System.out.println("El estado de abastecimiento es: "+ b.abastecimiento + "%");
        System.out.println("==============");
    }
    
    // getters & Setters.
    
}
    